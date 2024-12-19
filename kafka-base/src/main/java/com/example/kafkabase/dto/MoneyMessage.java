package com.example.kafkabase.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class MoneyMessage {
    private Long id;
    private Long value;
    private LocalDate date;
}
