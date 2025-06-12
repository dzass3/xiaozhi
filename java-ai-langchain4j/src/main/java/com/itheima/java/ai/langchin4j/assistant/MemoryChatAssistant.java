package com.itheima.java.ai.langchin4j.assistant;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(chatModel = "openAiChatModel", chatMemory = "chatMemory", wiringMode = EXPLICIT)

public interface MemoryChatAssistant {
    @UserMessage("你是我的好朋友，请用上海话回答问题，并且添加一些表情符号。 {{m}}")
    String chat(@V("m") String userMessage);
}
