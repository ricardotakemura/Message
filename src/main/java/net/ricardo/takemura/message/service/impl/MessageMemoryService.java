package net.ricardo.takemura.message.service.impl;

import net.ricardo.takemura.message.dto.MessageDTO;
import net.ricardo.takemura.message.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Vector;

@Service("memory")
public class MessageMemoryService implements MessageService {

    private static List<MessageDTO> memory = new Vector<MessageDTO>();

    @Override
    public List<MessageDTO> getMessages() {
        return MessageMemoryService.memory;
    }

    @Override
    public void createMessage(MessageDTO message) {
        MessageMemoryService.memory.add(message);
    }
}
