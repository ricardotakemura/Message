package net.ricardo.takemura.message.repository;

import net.ricardo.takemura.message.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
