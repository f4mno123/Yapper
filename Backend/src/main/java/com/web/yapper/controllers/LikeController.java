package com.web.yapper.controllers;

import com.web.yapper.dtos.LikeDto;
import com.web.yapper.models.Like;
import com.web.yapper.models.Post;
import com.web.yapper.repositories.LikeRepository;
import com.web.yapper.repositories.PostRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/like")
@RestController
public class LikeController {

    private final PostRepository postRepository;
    private final LikeRepository likeRepository;

    public LikeController(PostRepository postRepository, LikeRepository likeRepository) {
        this.postRepository = postRepository;
        this.likeRepository = likeRepository;
    }

    @PostMapping("/like")
    public String likePost(@RequestBody LikeDto likeDto) {
        Post post = postRepository.findById(Math.toIntExact(likeDto.getPostId()))
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Like like = new Like();
        like.setPost(post);
        likeRepository.save(like);

        return "Post liked successfully";
    }

    @DeleteMapping("/unlike")
    public String unlikePost(@RequestBody LikeDto likeDto) {
        Post post = postRepository.findById(Math.toIntExact(likeDto.getPostId()))
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Like like = likeRepository.findByPostId(Math.toIntExact(post.getId()))
                .orElseThrow(() -> new IllegalArgumentException("Like not found"));

        likeRepository.delete(like);
        return "Post unliked successfully";
    }
}