package com.project.house.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.house.entities.Category;
import com.project.house.entities.Post;
import com.project.house.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

	List<Post> findByTitleContaining(String title);
}
