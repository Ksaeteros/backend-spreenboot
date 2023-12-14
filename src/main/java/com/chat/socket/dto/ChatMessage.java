package com.chat.socket.dto;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@CrossOrigin(origins = "http://frontend-angular-f7810.web.app")
@AllArgsConstructor
public class ChatMessage {
    String message;
    String user;
}
