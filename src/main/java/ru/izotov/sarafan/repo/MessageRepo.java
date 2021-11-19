package ru.izotov.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.izotov.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
