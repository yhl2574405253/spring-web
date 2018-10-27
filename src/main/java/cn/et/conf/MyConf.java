package cn.et.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class MyConf {
	@Value("${url}")
	private String url;
	@Value("${driverClass}")
	private String driverClassName;
	@Value("${userid}")
	private String userName;
	@Value("${password2}")
	private String password;

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public DataSource dataSouce(){
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setDriverClassName(driverClassName);
		dmds.setUsername(userName);
		dmds.setPassword(password);
		return dmds;
	}
	
}
