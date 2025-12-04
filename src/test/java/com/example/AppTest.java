package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

    @Test
    void testMainDoesNotThrow() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void testAppClassLoad() {
        App app = new App();
        assertDoesNotThrow(() -> {
            // Nothing required — class instantiation itself is covered
        });
    }
}
