package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Advanced Java Calculator App v1.0!");

        InputParser parser = new InputParser();
        Calculator calculator = new BasicCalculator();

        double num1 = parser.getNumber("Enter the first number: ");
        double num2 = parser.getNumber("Enter the second number: ");

        System.out.println("\nOperations: 1: ADD | 2: SUBTRACT | 3: MULTIPLY | 4: DIVIDE");
        double opChoice = parser.getNumber("Choose an operation (1-4): ");

        Operation op;
        if (opChoice == 1) op = Operation.ADD;
        else if (opChoice == 2) op = Operation.SUBTRACT;
        else if (opChoice == 3) op = Operation.MULTIPLY;
        else if (opChoice == 4) op = Operation.DIVIDE;
        else {
            System.out.println("Invalid operation selected. Exiting.");
            return;
        }

        try {
            double result = calculator.calculate(num1, num2, op);
            System.out.println("\nResult: " + result);
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
