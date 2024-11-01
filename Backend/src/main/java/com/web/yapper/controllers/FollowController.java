package com.web.yapper.controllers;

import com.web.yapper.dtos.FollowDto;
import com.web.yapper.models.Follow;
import com.web.yapper.models.User;
import com.web.yapper.repositories.FollowRepository;
import com.web.yapper.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/follow")
@RestController
public class FollowController {

    private final UserRepository userRepository;
    private final FollowRepository followRepository;

    public FollowController(UserRepository userRepository, FollowRepository followRepository) {
        this.userRepository = userRepository;
        this.followRepository = followRepository;
    }

    @PostMapping("/follow")
    public String followUser(@RequestBody FollowDto followDto) {
        User follower = userRepository.findById(Math.toIntExact(followDto.getFollowerId()))
                .orElseThrow(() -> new IllegalArgumentException("Follower not found"));
        User followee = userRepository.findById(Math.toIntExact(followDto.getFolloweeId()))
                .orElseThrow(() -> new IllegalArgumentException("Followee not found"));

        Follow follow = new Follow();
        follow.setFollower(follower);
        follow.setFollowee(followee);

        followRepository.save(follow);

        return "User followed successfully";
    }

    @DeleteMapping("/unfollow")
    public String unfollowUser(@RequestBody FollowDto followDto) {
        User follower = userRepository.findById(Math.toIntExact(followDto.getFollowerId()))
                .orElseThrow(() -> new IllegalArgumentException("Follower not found"));
        User followee = userRepository.findById(Math.toIntExact(followDto.getFolloweeId()))
                .orElseThrow(() -> new IllegalArgumentException("Followee not found"));

        Follow follow = followRepository.findByFollowerAndFollowee(follower, followee)
                .orElseThrow(() -> new IllegalArgumentException("Follow not found"));

        followRepository.delete(follow);
        return "User unfollowed successfully";
    }
}