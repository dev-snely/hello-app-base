package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testMessageIsNotNull() {
        assertNotNull(App.getMessage(), "Le message ne doit pas être null");
    }

    @Test
    public void testMessageContent() {
        assertEquals("Le message doit être exactement 'Hello, World'", "Hello, World", App.getMessage());
    }
}
