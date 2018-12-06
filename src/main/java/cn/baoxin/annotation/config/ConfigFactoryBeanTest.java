package cn.baoxin.annotation.config;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigFactoryBeanTest {
	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFactoryBean.class);
		
		//class cn.baoxin.annotation.bean.User
		System.out.println(context.getBean("userFactoryBean").getClass());
		
		//class cn.baoxin.annotation.bean.UserFactoryBean
		System.out.println(context.getBean(BeanFactory.FACTORY_BEAN_PREFIX + "userFactoryBean").getClass());
		context.close();
	}
}
