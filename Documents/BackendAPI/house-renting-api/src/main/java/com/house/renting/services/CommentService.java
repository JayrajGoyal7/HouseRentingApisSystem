package com.house.renting.services;

import com.house.renting.payloads.CommentDto;

public interface CommentService {

	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);
	
}
