package cn.baoxin.annotation.config;

import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * 自定义扫描过滤规则
 * @ClassName:ConfigATypeFilter
 * @Description:
 * @author: baoxina
   @date: 2018年12月4日 下午12:04:07
 */
public class ComponentScanTypeFilter implements TypeFilter{
	/**
	 * metadataReader：读取到的当前正在扫描的类的信息
	 * metadataReaderFactory:可以获取到其他任何类信息的
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//获取当前正在扫描类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println("扫描到类[" + metadataReader.getClassMetadata().getClassName());
		if(metadataReader.getClassMetadata().getClassName().contains("Service")) {
			return true;
		}
		return false;
	}
}
