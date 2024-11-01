package com.web.yapper.repositories;

import com.web.yapper.models.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends CrudRepository<Like, Integer> {
    Iterable<Like> findByUserId(int userId);
    Optional<Like> findByPostId(int postId);
}