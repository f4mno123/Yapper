package com.web.yapper.controllers;

import com.web.yapper.dtos.CommentDto;
import com.web.yapper.models.Comment;
import com.web.yapper.models.Post;
import com.web.yapper.models.User;
import com.web.yapper.repositories.CommentRepository;
import com.web.yapper.repositories.PostRepository;
import com.web.yapper.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/comment")
@RestController
public class CommentController {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public CommentController(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @PostMapping("/create")
    public String createComment(@RequestBody CommentDto commentDto) {
        User user = userRepository.findById(Math.toIntExact(commentDto.getUserId()))
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Post post = postRepository.findById(Math.toIntExact(commentDto.getPostId()))
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Comment comment = new Comment();
        comment.setCommentContent(commentDto.getContent());
        comment.setPost(post);
        comment.setUser(user);
        commentRepository.save(comment);

        return "Comment created successfully";
    }

    @GetMapping("/{id}")
    public CommentDto getComment(@PathVariable int id) {
        Comment comment = commentRepository.findById((long) id)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));
        CommentDto commentDto = new CommentDto();
        commentDto.setContent(comment.getCommentContent());
        commentDto.setUserId(Long.valueOf(comment.getUser().getId()));
        commentDto.setPostId(comment.getPost().getId());
        return commentDto;
    }

    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable int id) {
        Comment comment = commentRepository.findById((long) id)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));
        commentRepository.delete(comment);

        return "Comment deleted successfully";
    }

    @PutMapping("/{id}")
    public String updateComment(@PathVariable int id, @RequestBody CommentDto commentDto) {
        Comment comment = commentRepository.findById((long) id)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));

        comment.setCommentContent(commentDto.getContent());
        commentRepository.save(comment);

        return "Comment updated successfully";
    }

    @GetMapping("/post/{postId}")
    public Iterable<Comment> getCommentsByPost(@PathVariable int postId) {
        return commentRepository.findByPostId((long) postId);
    }
}