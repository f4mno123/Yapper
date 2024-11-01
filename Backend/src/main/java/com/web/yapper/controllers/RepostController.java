package com.web.yapper.controllers;

import com.web.yapper.dtos.RepostDto;
import com.web.yapper.models.Post;
import com.web.yapper.models.Repost;
import com.web.yapper.models.User;
import com.web.yapper.repositories.PostRepository;
import com.web.yapper.repositories.RepostRepository;
import com.web.yapper.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/repost")
@RestController
public class RepostController {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final RepostRepository repostRepository;

    public RepostController(UserRepository userRepository, PostRepository postRepository, RepostRepository repostRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.repostRepository = repostRepository;
    }

    @PostMapping("/add")
    public String addRepost(@RequestBody RepostDto repostDto) {
        User user = userRepository.findById(Math.toIntExact(repostDto.getUserId()))
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Post post = postRepository.findById(Math.toIntExact(repostDto.getPostId()))
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Repost repost = new Repost();
        repost.setUser(user);
        repost.setPost(post);
        repostRepository.save(repost);

        return "Repost added successfully";
    }

    @DeleteMapping("/delete")
    public String deleteRepost(@RequestBody RepostDto repostDto) {
        User user = userRepository.findById(Math.toIntExact(repostDto.getUserId()))
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Post post = postRepository.findById(Math.toIntExact(repostDto.getPostId()))
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Repost repost = repostRepository.findByUserIdAndPostId(user.getId(), Math.toIntExact(post.getId()))
                .orElseThrow(() -> new IllegalArgumentException("Repost not found"));

        repostRepository.delete(repost);

        return "Repost deleted successfully";
    }
}