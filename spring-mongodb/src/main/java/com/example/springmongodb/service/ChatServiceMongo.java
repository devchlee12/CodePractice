package com.example.springmongodb.service;

import com.example.springmongodb.domain.ChatMessage;
import com.example.springmongodb.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceMongo {
    private final ChatMessageRepository chatMessageRepository;

    public void saveChat(ChatMessage chatMessage){
        System.out.println(chatMessage);
        chatMessage.setTime(LocalDateTime.now());
        chatMessageRepository.save(chatMessage);
    }
    public List<ChatMessage> getMessageAfter(LocalDateTime time){
        List<ChatMessage> bySendTimeAfter = chatMessageRepository.findBySendTimeAfter(time);
        return bySendTimeAfter;
    }
}
