package cn.baoxin.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean,DisposableBean{
	public void execute() {
		System.out.println("Dog使用中...");
	}
	public Dog() {
		System.out.println("Dog的构造器调用.");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("Dog的@PostConstruct方法调用.");
	}
	@PreDestroy
	public void preDestory() {
		System.out.println("Dog的@PreDestroy方法调用.");
	}
	public void customInit() {
		System.out.println("Dog的@Bean(initMethod)方法调用.");
	}
	public void customDestory() {
		System.out.println("Dog的@Bean(destroyMethod)方法调用.");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Dog的InitializingBean的afterPropertiesSet方法调用.");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Dog的DisposableBean接口的destroy方法调用.");
	}
}
