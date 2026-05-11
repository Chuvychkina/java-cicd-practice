package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;
    
    @BeforeEach
    void setUp() {
        main = new Main();
    }
    
    @Test
    void testAdd() {
        assertEquals(5, main.add(2, 3));
        assertEquals(0, main.add(-1, 1));
        assertEquals(-5, main.add(-2, -3));
    }
    
    @Test
    void testGreet() {
        assertEquals("Hello, John!", main.greet("John"));
        assertEquals("Hello, Guest!", main.greet(null));
        assertEquals("Hello, Guest!", main.greet(""));
    }
}
