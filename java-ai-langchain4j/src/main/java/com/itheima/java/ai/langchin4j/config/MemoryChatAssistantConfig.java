package com.itheima.java.ai.langchin4j.config;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//智能体

@Configuration

public class MemoryChatAssistantConfig {
    @Bean
    public ChatMemory  chatMemory() {
        return MessageWindowChatMemory.withMaxMessages(10);

    }



}
