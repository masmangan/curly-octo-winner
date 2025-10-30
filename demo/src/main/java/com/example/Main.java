package com.example;


import static java.lang.System.out;

/**
 * A classe Hello é um exemplo simples, que é a solução do Bee1000!
 */
public final class Main {

    private Main() {

    }

    public static String greetings() {
        return "Hello World!";
    }

    public static void main(final String[] args) {
        out.println(greetings());
    }

}