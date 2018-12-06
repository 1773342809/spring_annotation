package cn.baoxin.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GoodsDetails implements InitializingBean,DisposableBean{
	
	public void execute() {
		System.out.println("GoodsDetailsʹ����...");
	}
	
	public GoodsDetails() {
		System.out.println("GoodsDetails�Ĺ���������.");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("GoodsDetails��@PostConstruct��������.");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("GoodsDetails��@PreDestroy��������.");
	}
	
	public void customInit() {
		System.out.println("GoodsDetails��@Bean(initMethod)��������.");
	}
	
	public void customDestory() {
		System.out.println("GoodsDetails��@Bean(destroyMethod)��������.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("GoodsDetails��InitializingBean��afterPropertiesSet��������.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("GoodsDetails��DisposableBean�ӿڵ�destroy��������.");
	}
}
