package com.itheima.java.ai.langchin4j;

import com.itheima.java.ai.langchin4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class ChatMemoryTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testChatMemory5() {
        String answer1 = separateChatAssistant.chat(1,"我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat(1,"我是谁");
        System.out.println(answer2);
        String answer3 = separateChatAssistant.chat(2,"我是谁");
        System.out.println(answer3);
    }
}
