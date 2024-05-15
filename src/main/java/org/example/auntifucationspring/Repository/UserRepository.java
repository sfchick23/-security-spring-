package org.example.auntifucationspring.Repository;

import org.example.auntifucationspring.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //окутываем класс юзер в optional чтобы использовать в сервисе фичу .orElseThrow(() -> new ...)
    Optional<User> findUserByName(String username);

    boolean existsUserByName(String username);
    boolean existsUsersByEmail(String email);
}
