/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.pedrohubner.pocdeliverysubsidiaryservice;

public class App {
    public static String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        final var sumResult = sum(1, 2);
        System.out.println(getGreeting() + sumResult);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}