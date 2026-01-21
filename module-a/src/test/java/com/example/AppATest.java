package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppATest {
    @Test
    void testMessage() {
        assertTrue(AppA.message().contains("Module A"));
    }
}
