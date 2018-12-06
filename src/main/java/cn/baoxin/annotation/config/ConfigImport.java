package cn.baoxin.annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.baoxin.annotation.bean.User;
import cn.baoxin.annotation.importor.MyImportBeanDefinitionRegistrar;
import cn.baoxin.annotation.importor.MyImportSelector;

@Configuration
@Import({User.class,SimpleConfig.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ConfigImport {
}
