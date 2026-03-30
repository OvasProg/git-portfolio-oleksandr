package org.example;
import java.util.Scanner;

public class InputParser {
    private final Scanner scanner = new Scanner(System.in);

    public double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}