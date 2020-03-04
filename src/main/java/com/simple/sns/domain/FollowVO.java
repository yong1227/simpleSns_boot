package com.simple.sns.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FollowVO {

	private Long followeeId;
	private Long followerId;
	private String createdAt;
	
}
