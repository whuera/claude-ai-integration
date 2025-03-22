package com.example.service;

import org.springframework.ai.anthropic.AnthropicChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class ClaudeAIService {

    private final AnthropicChatClient anthropicChatClient;

    public ClaudeAIService(AnthropicChatClient anthropicChatClient) {
        this.anthropicChatClient = anthropicChatClient;
    }

    public String chatWithClaude(String userMessage) {
        Prompt prompt = new Prompt(userMessage);
        ChatResponse response = anthropicChatClient.call(prompt);
        return response.getResult().getOutput().getContent();
    }
}
