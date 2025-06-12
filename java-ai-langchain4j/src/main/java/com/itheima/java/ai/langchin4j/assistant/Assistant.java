package com.itheima.java.ai.langchin4j.assistant;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(chatModel = "openAiChatModel", chatMemoryProvider = "chatMemoryProvider", wiringMode = AiServiceWiringMode.EXPLICIT)
public interface Assistant {
    String chat(String message);
}
