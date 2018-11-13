package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        // Given
        // When
        Logger.getInstance().log("Logging test");
        String result = Logger.getInstance().getLastLog();
        // Then
        Assert.assertEquals("Logging test", result);
    }
}
