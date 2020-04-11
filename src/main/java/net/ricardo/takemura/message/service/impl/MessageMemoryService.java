package net.ricardo.takemura.message.service.impl;

import net.ricardo.takemura.message.dto.MessageDTO;
import net.ricardo.takemura.message.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memory")
public class MessageMemoryService implements MessageService {

    //TODO-15
    //Criar uma variavel estatica e privada da classe List<MessageDTO>
    //e instancie esta com a classe Vector<MessageDTO>

    @Override
    public List<MessageDTO> getMessages() {
        //TODO-16
        //Retorne a variavel estatica da classe List<MessageDTO>
        return null;
    }

    @Override
    public void createMessage(MessageDTO message) {
        //TODO-17
        //Use o metodo add da variavel estatica da
        //classe List<MessageDTO> e passe o parametro recebido
    }
}
