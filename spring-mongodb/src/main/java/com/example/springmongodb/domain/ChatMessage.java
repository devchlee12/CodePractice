package com.example.springmongodb.domain;

import com.example.springmongodb.dto.ChatMessageDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "chat_message")
@AllArgsConstructor
@ToString
@Getter
public class ChatMessage {
    private Long userId;
    private String message;
    private LocalDateTime sendTime;

    public void setTime(LocalDateTime time){
        sendTime = time;
    }

    public ChatMessageDto toDto(){
        return new ChatMessageDto(userId,message,sendTime);
    }
}
