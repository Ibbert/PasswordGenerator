import java.util.Scanner;

// USN 2021, Fall 
// OBJ2000
// Created by Ibbert

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}