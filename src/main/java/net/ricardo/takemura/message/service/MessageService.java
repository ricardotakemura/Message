package net.ricardo.takemura.message.service;

import net.ricardo.takemura.message.dto.MessageDTO;

import java.util.List;

public interface MessageService {
    List<MessageDTO> getMessages();
    void createMessage(MessageDTO message);
}
