package com.example;

import com.example.service.ClaudeAIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClaudeAITests {

    @Autowired
    private ClaudeAIService claudeAIService;

    @Test
    void testClaudeAIResponse() {
        String response = claudeAIService.chatWithClaude("What is Java?");
        assertNotNull(response);
        assertFalse(response.isEmpty());
    }
}
