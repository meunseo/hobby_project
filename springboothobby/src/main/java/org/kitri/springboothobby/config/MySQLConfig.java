package org.kitri.springboothobby.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("org.kitri.springboothobby.dao")
public class MySQLConfig {
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) 
		throws Exception {
		
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		sessionFactory.setMapperLocations(resolver.getResources("classpath:mappers/*.xml"));
		sessionFactory.setTypeAliasesPackage("org.kitri.springboothobby.dto, org.kitri.springboothobby.entity");
		
		return sessionFactory.getObject();
	}
}
