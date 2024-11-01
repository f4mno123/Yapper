package com.web.yapper.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FollowDto {
    private Long followerId;
    private Long followeeId;
}
