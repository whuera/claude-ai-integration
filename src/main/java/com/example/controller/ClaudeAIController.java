package com.example.controller;

import com.example.service.ClaudeAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claude")
public class ClaudeAIController {

    private final ClaudeAIService claudeAIService;

    public ClaudeAIController(ClaudeAIService claudeAIService) {
        this.claudeAIService = claudeAIService;
    }

    @PostMapping("/chat")
    public String chatWithClaude(@RequestBody String message) {
        return claudeAIService.chatWithClaude(message);
    }
}
