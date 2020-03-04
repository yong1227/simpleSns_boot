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
public class FeedVO {

	private Long userId;
	private Long followeeId;
	private Long postId;
	private String createdAt;
	
}
