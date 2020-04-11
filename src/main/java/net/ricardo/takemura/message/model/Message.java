package net.ricardo.takemura.message.model;

import javax.persistence.Entity;

//TODO-1
//Adicione a anotacao @Table com o nome de MESSAGE
@Entity
public class Message {

    //TODO-2
    //Crie a propriedade id
    // - privada do tipo Long
    // - com os metodos publicos get e set
    // - adicione acima da declaracao, a anotacao @Id
    // - adicione acima da declaracao, a anotacao @GeneratedValue com o valor AUTO_INCREMENT

    //TODO-3
    //Crie a propriedade text
    // - privada do tipo String
    // - com os metodos publicos get e set
    // - adicione acima da declaracao, a anotacao @Column com o nome "TEXT", tamanho de 255 e nullable = false

    //TODO-4
    //Crie a propriedade sender
    // - privada do tipo String
    // - com os metodos publicos get e set
    // - adicione acima da declaracao, a anotacao @Column com o nome "SENDER", tamanho de 100 e nullable = false
}
