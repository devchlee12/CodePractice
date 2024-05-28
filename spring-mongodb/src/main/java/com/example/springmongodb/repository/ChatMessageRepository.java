package com.example.springmongodb.repository;

import com.example.springmongodb.domain.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ChatMessageRepository extends MongoRepository<ChatMessage,String> {
    public List<ChatMessage> findBySendTimeAfter(LocalDateTime time);
}
