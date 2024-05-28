package com.example.springmongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ChatMessageDto {
    private Long userId;
    private String message;
    private LocalDateTime sendTime;
}
