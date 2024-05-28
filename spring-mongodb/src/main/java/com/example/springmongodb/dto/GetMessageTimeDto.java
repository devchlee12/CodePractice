package com.example.springmongodb.dto;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class GetMessageTimeDto {
    private LocalDateTime sendTime;
}
