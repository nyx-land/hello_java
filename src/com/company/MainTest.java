package com.company;

import org.junit.jupiter.api.Test;
import com.company.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void mainTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main();
        assertEquals("Hello World", outContent.toString());
    }
}