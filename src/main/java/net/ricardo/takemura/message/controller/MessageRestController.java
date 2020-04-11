package net.ricardo.takemura.message.controller;

import net.ricardo.takemura.message.business.MessageBusiness;
import net.ricardo.takemura.message.business.exception.InvalidMessageException;
import net.ricardo.takemura.message.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageRestController {

    @Autowired
    protected MessageBusiness messageBusiness;

    @RequestMapping(path = "message", method = RequestMethod.GET)
    public ResponseEntity<List<MessageDTO>> getMessages() {
        List<MessageDTO> messages = messageBusiness.listAll();
        return new ResponseEntity<List<MessageDTO>>(messages, HttpStatus.OK);
    }

    @RequestMapping(path = "message", method = RequestMethod.PUT)
    public ResponseEntity<MessageDTO> putMessage(@RequestBody MessageDTO message) {
        try {
            messageBusiness.create(message);
            return new ResponseEntity<MessageDTO>(message, HttpStatus.CREATED);
        } catch (InvalidMessageException e) {
            return new ResponseEntity<MessageDTO>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

}
