package cn.baoxin.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cn.baoxin.annotation.bean.Assemble;

@Configuration
@ComponentScan(basePackages= {"cn.baoxin.annotation.bean","cn.baoxin.annotation.controller"})
public class ConfigAssemble {
	@Bean("assemble2")
	public Assemble assemble() {
		Assemble assemble = new Assemble();
		assemble.setLable("2");
		return assemble;
	}
}
