package cn.baoxin.annotation.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.baoxin.annotation.bean.Goods;
import cn.baoxin.annotation.bean.Order;
import cn.baoxin.annotation.controller.GoodsController;
import cn.baoxin.annotation.dao.GoodsDAO;

/**
 * @ComponentScan  value:指定要扫描的包
	excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
	includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件。使用includeFilters时需要关闭Spring默认的过滤规则，即useDefaultFilters=false
	FilterType.ANNOTATION：按照注解
	FilterType.ASSIGNABLE_TYPE：按照给定的类型；
	FilterType.ASPECTJ：使用ASPECTJ表达式
	FilterType.REGEX：使用正则指定
	FilterType.CUSTOM：使用自定义规则
 */
@Configuration
@ComponentScan(
		basePackages = {"cn.baoxin.annotation"},
		includeFilters = {
				@Filter(type=FilterType.ANNOTATION,value= Controller.class),
				@Filter(type=FilterType.ASSIGNABLE_TYPE,value= {Goods.class,GoodsController.class,GoodsDAO.class}),
				@Filter(type=FilterType.CUSTOM,value= {ComponentScanTypeFilter.class})//FilterType.CUSTOM不建议与FilterType.ANNOTATION、FilterType.ASSIGNABLE_TYPE共同使用
		},
		useDefaultFilters=false)
public class ConfigComponentScan {
	
	/**
	 * @Scope:调整作用域
	 * ConfigurableBeanFactory#SCOPE_PROTOTYPE    默认是单实例的
	 * ConfigurableBeanFactory#SCOPE_SINGLETON  
	 * org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
	 * org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
	 * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
	 * 					每次获取的时候才会调用方法创建对象；
	 * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
	 * 			以后每次获取就是直接从容器（map.get()）中拿，
	 * request：同一次请求创建一个实例
	 * session：同一个session创建一个实例
	 * 
	 * 懒加载：@Lazy
	 * 		单实例bean：默认在容器启动的时候创建对象；
	 * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
	 * 
	 */
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Lazy
	@Bean
	public Order order() {
		return new Order();
	}

}
