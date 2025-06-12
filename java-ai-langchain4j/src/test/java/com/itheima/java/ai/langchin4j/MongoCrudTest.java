package com.itheima.java.ai.langchin4j;

import com.itheima.java.ai.langchin4j.bean.ChatMessages;
import org.springframework.data.mongodb.core.query.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootTest





public class MongoCrudTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    //    @Test
//    public void testInsert() {
//        ChatMessages chatMessages = new ChatMessages(, "hello world");
//        mongoTemplate.insert(chatMessages);
//    }
    @Test
    public void testInsert2() {
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("聊天记录列表");
        mongoTemplate.insert(chatMessages);
    }

    @Test
    public void testFindById() {
        ChatMessages chatMessages = mongoTemplate.findById("684036a2805c9f7d2c4a5c3a",
                ChatMessages.class);
        System.out.println(chatMessages);
    }

    /**
     * 修改文档
     */
    @Test
    public void testUpdate() {
        Criteria criteria = Criteria.where("_id").is("6801ead733ba9c4a0d9b6c7b");
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("content", "新的聊天记录列表");
        //修改或新增
        mongoTemplate.upsert(query, update, ChatMessages.class);
    }
    /**
     * 删除文档
     */
    @Test
    public void testDelete() {
        Criteria criteria = Criteria.where("_id").is("100");
        Query query = new Query(criteria);
        mongoTemplate.remove(query, ChatMessages.class);
    }
}

