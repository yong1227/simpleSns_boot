# SNS Project (springboot version)
![main](https://user-images.githubusercontent.com/46583498/75926388-d25ec200-5ead-11ea-9f61-dbf89728f47a.png)

# 프로젝트 소개
  ***SNS 기능을 구현한 프로젝트입니다.***
  
# 기능
  - 회원가입 
  - 로그인
  - 글 작성
  - 글 수정
  - 글 삭제
  - 팔로우 버튼

# 사용 기술
  -  Spring Boot
  -  JPA
  -  FreeMarker
  
# 필수 조건 
 - 자바 설치 (https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
 - STS 설치 (Spring boot는 4버전 권장) (https://spring.io/tools)
 - MySQL(5.7), MySQL Workbench(8) 설치 (https://dev.mysql.com/downloads/)
 - 프로젝트 폴더에 simpleSns_tables.sql 파일 실행 --> 데이터베이스, 테이블 생성
 - resource폴더에 aplication.properties생성 --> 로컬의 MySQL 관련 정보, freemarker, js 파일 위치 설정 작성
 ```
 #jdbc 
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username=계정이름
spring.datasource.password=비밀번호

#freemarker
spring.freemarker.template-loader-path=classpath:/templates
spring.freemarker.suffix=.ftl

#static
spring.mvc.static-path-pattern=/**
 ```
 
# 실행 방법
 - Eclipse : Boot Dashboard --> local --> simpleSns 우클릭 -- start
 - cmd : 프로젝트 다운로드 --> cmd 창에서 해당 프로젝트 경로로 이동 --> 'mvn package' 명령어 입력 (jar 파일 생성)--> target 폴더로 이동 -->     'java -jar simpleSns-0.0.1-SNAPSHOT.jar' 명령어 입력(jar 파일 실행) --> 브라우저 주소창에 'localhost:8080' 입력

# 블로그
 https://thankstory.tistory.com
 
---

#### ````이 프로젝트는 CODEPRESSO의 DEV-OPS 과정 중 실습한 프로젝트입니다.````
