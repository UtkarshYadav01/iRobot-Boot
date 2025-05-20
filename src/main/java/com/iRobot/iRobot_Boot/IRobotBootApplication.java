package com.iRobot.iRobot_Boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IRobotBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IRobotBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Robot robot = new Robot(0, 0, 'S'); // Starting at (0,0,S)
        if (args.length == 0) {
            System.out.println("Please provide robot command string as an argument. Example: MSMMEMM");
            return;
        }
        String command = args[0].toUpperCase();
        System.out.println("Initial Robot Location: " + robot.getLocation());
        System.out.println("COMMAND: " + command);
        robot.processCommands(command);
        System.out.println("Final Robot Location: " + robot.getLocation());
    }

}
