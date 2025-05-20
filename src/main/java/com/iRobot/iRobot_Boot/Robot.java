package com.iRobot.iRobot_Boot;

public class Robot {
    private int row;
    private int col;
    private char direction;

    private static final int MAX_ROWS = 4;
    private static final int MAX_COLS = 5;

    public Robot(int row, int col, char direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public void processCommands(String commands) {
        for (char cmd : commands.toCharArray()) {
            if (cmd == 'M') {
                move();
            } else {
                turn(cmd);
            }
        }
    }

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

    private void turn(char newDirection) {
        if ("NSEW".indexOf(newDirection) != -1 && newDirection != direction) {
            direction = newDirection;
        }
    }

    public String getLocation() {
        return String.format("(%d,%d,%c)", row, col, direction);
    }
}
