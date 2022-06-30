package com.project.house.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.house.entities.Comment;

public interface CommentsRepo extends JpaRepository<Comment, Integer>{

}
