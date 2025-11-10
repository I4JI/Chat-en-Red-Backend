package mx.edu.unpa.ChatEnRed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.unpa.ChatEnRed.domains.MessageStatus;

@Repository
public interface MessageStatusRepository extends JpaRepository<MessageStatus, Integer> {

}
