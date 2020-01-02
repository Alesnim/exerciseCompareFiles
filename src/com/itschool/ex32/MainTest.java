package com.itschool.ex32;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testCompare() throws IOException {
        assertTrue(Main.compareFile("./a.txt", "./b.txt"));
    }


    @Test
    void textCompareFalse() throws IOException {
        assertFalse(Main.compareFile("./a.txt", "./c.txt"));
    }

    @Test
    void testCompareBig() throws IOException {
        assertFalse(Main.compareFile("./big.txt", "./bigTwo.txt"));
    }
}