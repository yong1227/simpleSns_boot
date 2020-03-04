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
public class PostAndUserVO {

	private Long id;
	private Long userId;
	private String title;
	private String content;
	private String createdAt;
	private UserVO user;
	
}
