package org.example;

public class BasicCalculator implements Calculator {
    @Override
    public double calculate(double a, double b, Operation op) {
        switch (op) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            default:
                throw new UnsupportedOperationException("Operation not supported yet.");
        }
    }
}