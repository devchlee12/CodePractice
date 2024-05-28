package com.example.springmongodb.controller;

import com.example.springmongodb.domain.ChatMessage;
import com.example.springmongodb.dto.GetMessageTimeDto;
import com.example.springmongodb.service.ChatServiceMongo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final ChatServiceMongo chatServiceMongo;

    @PostMapping("/send-mongo")
    public void saveMessageMongo(@RequestBody ChatMessage chatMessage){
        chatServiceMongo.saveChat(chatMessage);
    }

    @GetMapping("/get-messages-mongo")
    public List<ChatMessage> getMessagesMongo(@RequestBody GetMessageTimeDto getMessageTimeDto){
        List<ChatMessage> messageAfter = chatServiceMongo.getMessageAfter(getMessageTimeDto.getSendTime());
        return messageAfter;
    }
}
