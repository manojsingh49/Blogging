package com.multiplexmoments.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplexmoments.blog.dao.PostDAO;
import com.multiplexmoments.blog.entity.Post;
@Service
public class PostService {
	@Autowired
	private PostDAO postDAO;
	
	public Post createPost(Post post) {
		return postDAO.save(post);
	}
	public Post getPostById(Integer postId) {
		return postDAO.findById(postId).get();
	}
	public Iterable<Post>getAllPost(){
		return postDAO.findAll();
	}
	public void deletePost(Integer postId) {
		postDAO.deleteById(postId);
	}
	public Post updatePost(Integer postId, String newContent){
		Post postFromDb = postDAO.findById(postId).get();
		postFromDb.setContent(newContent);
		Post updatePost = postDAO.save(postFromDb);
		return updatePost;
		
	}

}
