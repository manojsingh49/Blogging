package com.multiplexmoments.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiplexmoments.blog.entity.Post;
import com.multiplexmoments.blog.service.PostService;

@RestController
@RequestMapping(value ="/api/posts")
public class PostController {
	@Autowired
	private PostService postService;
	
	@PostMapping(value ="/create")
	public Post createPost(@RequestBody Post post) {
		return postService.createPost(post);
	}
	
	@GetMapping(value ="/post/{postId}")
	public Post getPostById(@PathVariable("postId") Integer postId) {
		return postService.getPostById(postId);
	}
	@GetMapping(value = "/post/allpost")
	public Iterable<Post>getAllPost(){
		return postService.getAllPost();
	}
	@DeleteMapping(value = "/post/{postId}")
	public void deletePost(@PathVariable("postId")Integer postId) {
		postService.deletePost(postId);
	}
	
	@PutMapping(value = "/post/{postId}/{newContent}")
	public Post updatePost(@PathVariable("postId")Integer postId, @PathVariable("newContent")String newContent){
		return postService.updatePost(postId, newContent);
	}
	

}
