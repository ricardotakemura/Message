package net.ricardo.takemura.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EntityScan
public class MessageApplication {

    public static void main(String... args) {
        SpringApplication.run(MessageApplication.class, args);
    }

}
