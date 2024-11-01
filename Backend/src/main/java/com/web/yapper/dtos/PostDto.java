package com.web.yapper.dtos;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private String content;
    private Integer userId;
    private int likeCount;
    private int repostCount;
    private int commentCount;
}
