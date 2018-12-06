package cn.baoxin.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.baoxin.annotation.bean.Dog;
import cn.baoxin.annotation.bean.GoodsDetails;
import cn.baoxin.annotation.processor.MyBeanPostProcessor;

@Configuration
@Import(value=MyBeanPostProcessor.class)
public class ConfigLifeCycle {

	@Bean(initMethod="customInit",destroyMethod="customDestory")
	public GoodsDetails goodsDetails() {
		return new GoodsDetails();
	}
	
	@Bean(initMethod="customInit",destroyMethod="customDestory")
	public Dog dog() {
		return new Dog();
	}
}
