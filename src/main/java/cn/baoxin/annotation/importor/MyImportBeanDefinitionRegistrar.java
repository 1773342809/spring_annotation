package cn.baoxin.annotation.importor;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import cn.baoxin.annotation.bean.Customer;

/**
 * �ֶ�����bean�����ֶ�ע�ᵽ������
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean user = registry.containsBeanDefinition("cn.baoxin.annotation.bean.User");
		boolean goods = registry.containsBeanDefinition("goods");
		if(user && goods) {
			RootBeanDefinition beanDefinition = new RootBeanDefinition(Customer.class);
			registry.registerBeanDefinition("customer", beanDefinition);
		}
	}
}
