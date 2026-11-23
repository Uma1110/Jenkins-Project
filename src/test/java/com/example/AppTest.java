package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApplicationMessage() {

        App app = new App();

        assertEquals(
            "Hello Jenkins! Welcome to my first CI/CD application.",
            app.getMessage()
        );
    }
}
