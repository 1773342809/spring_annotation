package cn.baoxin.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.baoxin.annotation.controller.AssembleController;

public class ConfigAssembleTest {
	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAssemble.class);
		AssembleController bean = context.getBean(AssembleController.class);
		bean.service();
		context.close();
	}
}
