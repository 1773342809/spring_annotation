package cn.baoxin.annotation.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigComponentScanTest {

	@Test
	public void test() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigComponentScan.class);
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		System.out.println("�����ڵ�bean");
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out.println("�����ڵ�bean");
	}
}
