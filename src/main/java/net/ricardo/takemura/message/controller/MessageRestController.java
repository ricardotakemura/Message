package net.ricardo.takemura.message.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    //TODO-21
    //Crie uma variavel da classe MessageBusiness e
    //adicione as anotacoes @Autowired

    //TODO-22
    //Crie um metodo publico getMessages() sem parametros
    //que retorne um objeto da classe ResponseEntity<List<MessageDTO>>
    //usando o metodo list() da variavel da classe MessageBusiness

    //TODO-23
    //- Crie um metodo publico putMessage(@RequestBody MessageDTO message)
    //com um parametro da classe MessageDTO e
    //que nao retorne um objeto da classe ResponseEntity<List<MessageDTO>>
    //- Trate a excecao InvalidMessageException e
    // retorne um objeto com a instancia ResponseEntity<List<MessageDTO>>(HttpStatus.UNPROCESSABLE_ENTITY)
    //- Use o metodo create da variavel da classe MessageBusiness passando o parametro deste metodo
}
