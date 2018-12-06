package cn.baoxin.annotation.bean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User>{
	@Override
	public User getObject() throws Exception {
		return new User();
	}
	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
