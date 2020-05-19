package com.dwmkerr.javagradlestandardversionsample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    public void expectHelloToGiveCorrectGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.Hello());
    }

    @Test
    public void expectGoodbyeToGiveCorrectGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Goodbye, Cruel World!", helloWorld.Goodbye());
    }
}