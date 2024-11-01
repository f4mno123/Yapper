package com.web.yapper.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeDto {
    private Long postId;
    private Long userId;
}
