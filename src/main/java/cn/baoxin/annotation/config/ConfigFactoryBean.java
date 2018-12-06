package cn.baoxin.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.baoxin.annotation.bean.UserFactoryBean;

@Configuration
public class ConfigFactoryBean {
	@Bean
	public UserFactoryBean userFactoryBean() {
		return new UserFactoryBean();
	}
}
