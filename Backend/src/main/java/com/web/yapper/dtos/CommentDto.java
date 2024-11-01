package com.web.yapper.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private String content;
    private Long postId;
    private Long userId;
}
