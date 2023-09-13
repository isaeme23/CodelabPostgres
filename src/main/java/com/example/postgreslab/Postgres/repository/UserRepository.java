package com.example.postgreslab.Postgres.repository;

import com.example.postgreslab.Postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
