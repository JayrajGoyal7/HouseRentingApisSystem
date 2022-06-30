package com.project.house.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.house.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
