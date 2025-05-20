package com.iRobot.iRobot_Boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class IRobotBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IRobotBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Robot robot = new Robot(0, 0, 'S'); // Starting at (0,0,S)
        String command = "";
        if (args.length == 0) {
            System.out.println("Please provide robot command string as an argument. Example: MSMMEMM");
            return;
        }

        // Check if the first argument is a file path
        if (args[0].endsWith(".txt")) {
            String filePath = args[0];
            try {
                // Read commands from the file and convert them to uppercase
                command = new String(Files.readAllBytes(Paths.get(filePath))).toUpperCase();
                System.out.println("COMMAND read from file: " + command);
            } catch (IOException e) {
                // Handle errors while reading from the file
                System.out.println("Error reading from file: " + e.getMessage());
                return;// Stop execution if the file can't be read
            }
        } else {
            // Otherwise, treat the argument as the command string
            command = args[0].toUpperCase();
            System.out.println("COMMAND from argument: " + command);
        }

        System.out.println("Initial Robot Location: " + robot.getLocation());
        robot.processCommands(command);
        System.out.println("Final Robot Location: " + robot.getLocation());

    }

}
