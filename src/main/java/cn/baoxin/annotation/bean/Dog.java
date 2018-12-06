package cn.baoxin.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean,DisposableBean{
	public void execute() {
		System.out.println("Dogʹ����...");
	}
	public Dog() {
		System.out.println("Dog�Ĺ���������.");
	}
	@PostConstruct
	public void postConstruct() {
		System.out.println("Dog��@PostConstruct��������.");
	}
	@PreDestroy
	public void preDestory() {
		System.out.println("Dog��@PreDestroy��������.");
	}
	public void customInit() {
		System.out.println("Dog��@Bean(initMethod)��������.");
	}
	public void customDestory() {
		System.out.println("Dog��@Bean(destroyMethod)��������.");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Dog��InitializingBean��afterPropertiesSet��������.");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Dog��DisposableBean�ӿڵ�destroy��������.");
	}
}
