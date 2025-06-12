package com.itheima.java.ai.langchin4j;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.output.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 public class EmbeddingTest {
 @Autowired
 private EmbeddingModel embeddingModel;
 @Test
 public void testEmbeddingModel(){
 Response<Embedding> embed = embeddingModel.embed("你好");
 }
 }