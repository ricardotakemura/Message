package net.ricardo.takemura.message.business;

import org.springframework.stereotype.Component;

@Component
public class MessageBusiness {

    //TODO-18
    //Crie uma variavel da classe MessageService e
    //adicione as anotacoes @Autowired e @Qualified (este com valor "memory")

    //TODO-19
    //Crie um metodo publico list() sem parametros que retorne uma lista de MessageDTO
    //usando o metodo getMessages da variavel da classe MessageService

    //TODO-20
    //- Crie um metodo publico create(MessageDTO message) throws InvalidMessageException
    //com um parametro da classe MessageDTO e que nao retorna nada
    //- Verifique se as propriedades text e sender estao preenchidas,
    //se nao estiverem lance a excecao InvalidMessageException
    //- Use o metodo createMessage da variavel da classe MessageService passando o parametro deste metodo
}
