package ru.izotov.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.izotov.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
