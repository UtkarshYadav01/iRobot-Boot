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


## Steps to Build and Run the Program

### Step 1: Build the JAR file

Before running the program, you need to build the project and generate the JAR file. To do this, use the Maven Wrapper (`mvnw`) provided in the project.

```bash
./mvnw clean package
```

### Step 2: To run the project, use the following command in the terminal:

```bash
java -jar ./target/iRobot-Boot-0.0.1-SNAPSHOT.jar MSMMEMM
```
or add a text file like 'commands.txt' and provide command in the file
```bash
java -jar ./target/iRobot-Boot-0.0.1-SNAPSHOT.jar commands.txt

