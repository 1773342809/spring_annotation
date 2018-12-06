package cn.baoxin.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.baoxin.annotation.bean.Dog;
import cn.baoxin.annotation.bean.GoodsDetails;

public class ConfigLifeCycleTest {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigLifeCycle.class);
		
		context.getBean(GoodsDetails.class).execute();
		context.getBean(Dog.class).execute();
		
		context.close();
	}

}
