package com.house.renting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.house.renting.entities.Comment;

public interface CommentsRepo extends JpaRepository<Comment, Integer>{

}
