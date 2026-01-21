package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppBTest {
    @Test
    void testMessage() {
        assertTrue(AppB.message().contains("Module B"));
    }
}
