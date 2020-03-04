package com.simple.sns.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "com.simple.sns.domain.**")
public class MyBatisConfig {
	
	   @Bean
	    public SqlSessionFactory sqlSessionFactory (DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	        sqlSessionFactory.setDataSource(dataSource);
	        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mappers/*.xml"));;
	        sqlSessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/model/modelConfig.xml"));
	        return sqlSessionFactory.getObject();
	    }
	    
	    @Bean
	    public SqlSessionTemplate sqlSession (SqlSessionFactory sqlSessionFactory) {
	        
	        return new SqlSessionTemplate(sqlSessionFactory);
	    }
}
