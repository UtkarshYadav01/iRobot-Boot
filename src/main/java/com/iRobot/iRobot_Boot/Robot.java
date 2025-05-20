package com.iRobot.iRobot_Boot;

/*
 * NOTE: The comments in this file (above the methods and class) were written with help from ChatGPT.
 * They are not part of the actual program logic or functional requirements.
 * I used ChatGPT to help write these comments to make the code easier to understand.
 */
public class Robot {
    private int row;
    private int col;
    private char direction;

    // Constants defining the grid's size (4 rows x 5 columns)
    private static final int MAX_ROWS = 4;
    private static final int MAX_COLS = 5;

    /**
     * Constructs a Robot with a specific starting position and direction.
     *
     * @param row       The starting row (0-based index)
     * @param col       The starting column (0-based index)
     * @param direction The initial direction ('N', 'S', 'E', or 'W')
     */
    public Robot(int row, int col, char direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    /**
     * Processes a series of commands that control the robot.
     *
     * @param commands A string containing the commands:
     *                 'M' to move forward, and
     *                 'N', 'S', 'E', or 'W' to change direction.
     */
    public void processCommands(String commands) {
        for (char cmd : commands.toCharArray()) {
            if (cmd == 'M') {
                move();
            } else {
                turn(cmd);
            }
        }
    }

    /**
     * Moves the robot one step in its current direction,
     * ensuring it does not move out of grid boundaries.
     */
    private void move() {
        switch (direction) {
            case 'N':
                if (row > 0) row--;
                break;
            case 'S':
                if (row < MAX_ROWS - 1) row++;
                break;
            case 'E':
                if (col < MAX_COLS - 1) col++;
                break;
            case 'W':
                if (col > 0) col--;
                break;
        }
    }

    /**
     * Changes the robot's direction if the new direction is valid
     * and different from the current direction.
     *
     * @param newDirection The new direction ('N', 'S', 'E', or 'W')
     */
    private void turn(char newDirection) {
        if ("NSEW".indexOf(newDirection) != -1 && newDirection != direction) {
            direction = newDirection;
        }
    }

    /**
     * Returns the robot's current location and direction.
     *
     * @return A string representation in the format "(row,col,direction)"
     */
    public String getLocation() {
        return String.format("(%d,%d,%c)", row, col, direction);
    }
}
