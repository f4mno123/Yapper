package com.web.yapper.controllers;

import com.web.yapper.dtos.PostDto;
import com.web.yapper.models.Post;
import com.web.yapper.models.User;
import com.web.yapper.repositories.PostRepository;
import com.web.yapper.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/post")
@RestController
public class PostController {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public PostController(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    @PostMapping("/create")
    public String createPost(@RequestBody PostDto postDto) {
        User user = userRepository.findById(postDto.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Post post = new Post();
        post.setContent(postDto.getContent());
        post.setUser(user);
        postRepository.save(post);
        return "Post created successfully";
    }

    @GetMapping("/{id}")
    public PostDto getPost(@PathVariable int id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));
        PostDto postDto = new PostDto();
        postDto.setContent(post.getContent());
        postDto.setUserId(post.getUser().getId());
        postDto.setLikeCount(post.getLikes().size());
        postDto.setRepostCount(post.getReposts().size());
        postDto.setCommentCount(post.getComments().size());
        return postDto;
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable int id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));
        postRepository.delete(post);

        return "Post deleted successfully";
    }

    @PutMapping("/{id}")
    public String updatePost(@PathVariable int id, @RequestBody PostDto postDto) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        post.setContent(postDto.getContent());
        postRepository.save(post);
        return "Post updated successfully";
    }

    @GetMapping("/user/{userId}")
    public Iterable<Post> getPostsByUser(@PathVariable int userId) {
        return postRepository.findByUserId(userId);
    }

}