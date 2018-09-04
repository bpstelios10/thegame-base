package com.thegame.thegame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thegame.thegame.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
