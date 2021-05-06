package com.midem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midem.models.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {}
