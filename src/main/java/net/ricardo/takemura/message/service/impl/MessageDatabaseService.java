package net.ricardo.takemura.message.service.impl;

import net.ricardo.takemura.message.dto.MessageDTO;
import net.ricardo.takemura.message.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("database")
public class MessageDatabaseService implements MessageService {

    //TODO-10
    //Criar uma variavel privada da classe MessageRepository com a anotacao @Autowired

    @Override
    //TODO-11
    //Coloque a anotacao @Transactional(propagation = Propagation.SUPPORTS)
    public List<MessageDTO> getMessages() {
        //TODO-12
        //Use o metodo findAll e transforme cada objeto da classe Message em MessageDTO (Lista)
        //Retorne a lista
        return null;
    }

    @Override
    //TODO-13
    //Coloque a anotacao @Transactional(propagation = Propagation.REQUIRED)
    public void createMessage(MessageDTO message) {
        //TODO-14
        //Transforme o objeto da classe MessageDTO para Message e
        //use o metodo saveAndFlush passando este objeto
    }
}
