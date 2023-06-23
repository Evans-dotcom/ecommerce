package com.tutorial.ecommerce.model.Dao;

import com.tutorial.ecommerce.model.LocalUser;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends ListCrudRepository<LocalUser, Long> {
    Optional<Object> findByEmailIgnoreCase(String email);

    Optional<Object> findByUsernameIgnoreCase(String username);
}
