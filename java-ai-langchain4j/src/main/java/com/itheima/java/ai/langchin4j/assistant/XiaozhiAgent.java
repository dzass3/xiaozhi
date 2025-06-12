package com.itheima.java.ai.langchin4j.assistant;


import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(
        chatModel = "openAiChatModel",
        chatMemoryProvider = "chatMemoryProviderXiaozhi",
        wiringMode = AiServiceWiringMode.EXPLICIT,
        tools = "appointmentTools",//tools配置
        contentRetriever = "contentRetrieverXiaozhi" //配置向量存储
)
public interface XiaozhiAgent {
    @SystemMessage(fromResource = "zhaozhi-prompt-template.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
