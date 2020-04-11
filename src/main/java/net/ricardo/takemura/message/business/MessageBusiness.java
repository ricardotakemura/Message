package net.ricardo.takemura.message.business;

import net.ricardo.takemura.message.business.exception.InvalidMessageException;
import net.ricardo.takemura.message.dto.MessageDTO;
import net.ricardo.takemura.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

@Component
public class MessageBusiness {

    @Autowired
    @Qualifier("database")
    private MessageService messageService;

    public List<MessageDTO> listAll() {
        return messageService.getMessages();
    }

    public void create(MessageDTO message) throws InvalidMessageException {
        if (StringUtils.isEmpty(message.getSender()) || StringUtils.isEmpty(message.getText())) {
            throw new InvalidMessageException();
        }
        messageService.createMessage(message);
    }
}
