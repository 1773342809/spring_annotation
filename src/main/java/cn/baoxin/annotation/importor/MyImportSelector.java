package cn.baoxin.annotation.importor;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 根据返回的指定类的全类名数组，创建bean，并自动注册到容器中
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {"cn.baoxin.annotation.bean.GoodsDetails"};
	}
}
