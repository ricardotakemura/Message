package net.ricardo.takemura.message.service.impl;

import net.ricardo.takemura.message.dto.MessageDTO;
import net.ricardo.takemura.message.model.Message;
import net.ricardo.takemura.message.repository.MessageRepository;
import net.ricardo.takemura.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("database")
public class MessageDatabaseService implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<MessageDTO> getMessages() {
        List<MessageDTO> ret = new ArrayList<MessageDTO>();
        for (Message message: messageRepository.findAll()) {
            ret.add(new MessageDTO(message.getSender(), message.getText()));
        }
        return ret;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void createMessage(MessageDTO message) {
        Message created = new Message();
        created.setSender(message.getSender());
        created.setText(message.getText());
        messageRepository.saveAndFlush(created);
    }
}
