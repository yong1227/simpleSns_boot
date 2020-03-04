package com.simple.sns.domain;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostVO {

	private Long id;
	private Long userId;
	private String title;
	private String content;
	private String createdAt;
	@JsonInclude(value = Include.NON_EMPTY)
	private UserVO user;
	
}
