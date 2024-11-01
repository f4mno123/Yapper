package com.web.yapper.repositories;

import com.web.yapper.models.Post;
import com.web.yapper.models.Repost;
import com.web.yapper.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepostRepository extends CrudRepository<Repost, Integer> {
    Iterable<Repost> findByUserId(int userId);
    Iterable<Repost> findByPostId(int postId);
    Optional<Repost> findByUserIdAndPostId(int userId, int postId);
}