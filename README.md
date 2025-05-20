# iRobot Movement Program

This program simulates a robot navigating a 5x4 grid using directional and movement commands.

## Grid
- 5 columns (0-4)
- 4 rows (0-3)
- Starting position: (0,0,S)

```
          N
          ↑
    W ←       → E
          ↓
          S

      0  1  2  3  4
    +--+--+--+--+--+                
0   |R↓|  |  |  |  |
    +--+--+--+--+--+
1   |  |  |  |  |  |
    +--+--+--+--+--+
2   |  |  |  |  |  |
    +--+--+--+--+--+
3   |  |  |  |  |  |
    +--+--+--+--+--+
```


## Commands
- **N, S, E, W**: Set direction
- **M**: Move forward one step in the current direction

## Example

COMMAND: MSMMEMM \
Robot Location: (3,2,E)


## Running the Program

To run the project, use the following command in the terminal:

```bash
java -jar ./target/iRobot-Boot-0.0.1-SNAPSHOT.jar MSMMEMM
