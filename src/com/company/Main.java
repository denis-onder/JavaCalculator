package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static void printResult(String msg) {
        System.out.println(msg);
    }
    private static void calculate(int a, int b, char op) {
        int result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
            break;
            case '*':
                result = a * b;
            break;
            case '/':
                result = a / b;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
        printResult("Result: " + a + " " + op + " " + b + " = " + result);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Number 1:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Number 2:");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Operator: (+, -, *, /)");
        char operator = reader.readLine().charAt(0);
        calculate(num1, num2, operator);
    }
}
