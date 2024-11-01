package com.web.yapper.repositories;

import com.web.yapper.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    Iterable<Post> findByUserId(int userId);
}

