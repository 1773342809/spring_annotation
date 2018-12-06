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
 * @ComponentScan  value:ָ��Ҫɨ��İ�
	excludeFilters = Filter[] ��ָ��ɨ���ʱ����ʲô�����ų���Щ���
	includeFilters = Filter[] ��ָ��ɨ���ʱ��ֻ��Ҫ������Щ�����ʹ��includeFiltersʱ��Ҫ�ر�SpringĬ�ϵĹ��˹��򣬼�useDefaultFilters=false
	FilterType.ANNOTATION������ע��
	FilterType.ASSIGNABLE_TYPE�����ո��������ͣ�
	FilterType.ASPECTJ��ʹ��ASPECTJ���ʽ
	FilterType.REGEX��ʹ������ָ��
	FilterType.CUSTOM��ʹ���Զ������
 */
@Configuration
@ComponentScan(
		basePackages = {"cn.baoxin.annotation"},
		includeFilters = {
				@Filter(type=FilterType.ANNOTATION,value= Controller.class),
				@Filter(type=FilterType.ASSIGNABLE_TYPE,value= {Goods.class,GoodsController.class,GoodsDAO.class}),
				@Filter(type=FilterType.CUSTOM,value= {ComponentScanTypeFilter.class})//FilterType.CUSTOM��������FilterType.ANNOTATION��FilterType.ASSIGNABLE_TYPE��ͬʹ��
		},
		useDefaultFilters=false)
public class ConfigComponentScan {
	
	/**
	 * @Scope:����������
	 * ConfigurableBeanFactory#SCOPE_PROTOTYPE    Ĭ���ǵ�ʵ����
	 * ConfigurableBeanFactory#SCOPE_SINGLETON  
	 * org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
	 * org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
	 * prototype����ʵ���ģ�ioc��������������ȥ���÷�������������������С�
	 * 					ÿ�λ�ȡ��ʱ��Ż���÷�����������
	 * singleton����ʵ���ģ�Ĭ��ֵ����ioc������������÷�����������ŵ�ioc�����С�
	 * 			�Ժ�ÿ�λ�ȡ����ֱ�Ӵ�������map.get()�����ã�
	 * request��ͬһ�����󴴽�һ��ʵ��
	 * session��ͬһ��session����һ��ʵ��
	 * 
	 * �����أ�@Lazy
	 * 		��ʵ��bean��Ĭ��������������ʱ�򴴽�����
	 * 		�����أ������������������󡣵�һ��ʹ��(��ȡ)Bean�������󣬲���ʼ����
	 * 
	 */
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Lazy
	@Bean
	public Order order() {
		return new Order();
	}

}
