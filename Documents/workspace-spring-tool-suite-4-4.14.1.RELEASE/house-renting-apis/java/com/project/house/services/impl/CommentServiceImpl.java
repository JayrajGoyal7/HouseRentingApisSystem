package com.project.house.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.house.entities.Comment;
import com.project.house.entities.Post;
import com.project.house.exceptions.ResourceNotFoundException;
import com.project.house.payloads.CommentDto;
import com.project.house.repositories.CommentsRepo;
import com.project.house.repositories.PostRepo;
import com.project.house.services.CommentService;



@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired 
	private CommentsRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {

		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", " Post Id ", postId)); 
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment com = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", " Comment Id ", commentId));
		this.commentRepo.delete(com);
	}

}
