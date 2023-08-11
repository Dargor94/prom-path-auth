package org.dargor.auth.repository;

import org.dargor.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthRepository extends JpaRepository<User, UUID> {

    Optional<User> findUserByEmail(String email);
    Optional<User> getUserByEmail(String email);

}
