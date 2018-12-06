package cn.baoxin.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GoodsDetails implements InitializingBean,DisposableBean{
	
	public void execute() {
		System.out.println("GoodsDetails使用中...");
	}
	
	public GoodsDetails() {
		System.out.println("GoodsDetails的构造器调用.");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("GoodsDetails的@PostConstruct方法调用.");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("GoodsDetails的@PreDestroy方法调用.");
	}
	
	public void customInit() {
		System.out.println("GoodsDetails的@Bean(initMethod)方法调用.");
	}
	
	public void customDestory() {
		System.out.println("GoodsDetails的@Bean(destroyMethod)方法调用.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("GoodsDetails的InitializingBean的afterPropertiesSet方法调用.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("GoodsDetails的DisposableBean接口的destroy方法调用.");
	}
}
