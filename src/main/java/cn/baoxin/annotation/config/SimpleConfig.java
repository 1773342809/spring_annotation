package cn.baoxin.annotation.config;

import org.springframework.context.annotation.Bean;

import cn.baoxin.annotation.bean.Goods;


public class SimpleConfig {
	@Bean
	public Goods goods() {
		return new Goods();
	}
}
