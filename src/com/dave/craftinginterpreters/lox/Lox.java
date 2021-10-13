package com.dave.craftinginterpreters.lox;

import java.io.IOException;

public class Lox {

    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage:  jlox [script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }

    public static void runFile(String scriptName) {}

    public static void runPrompt() {}

    
}
