package io.github.jeli01.securityjwtadvanced.repository;


import io.github.jeli01.securityjwtadvanced.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);
    UserEntity findByUsername(String username);
}
