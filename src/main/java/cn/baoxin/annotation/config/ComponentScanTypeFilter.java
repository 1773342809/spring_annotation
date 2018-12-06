package cn.baoxin.annotation.config;

import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * �Զ���ɨ����˹���
 * @ClassName:ConfigATypeFilter
 * @Description:
 * @author: baoxina
   @date: 2018��12��4�� ����12:04:07
 */
public class ComponentScanTypeFilter implements TypeFilter{
	/**
	 * metadataReader����ȡ���ĵ�ǰ����ɨ��������Ϣ
	 * metadataReaderFactory:���Ի�ȡ�������κ�����Ϣ��
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//��ȡ��ǰ����ɨ�����ע����Ϣ
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//��ȡ��ǰ����ɨ���������Ϣ
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println("ɨ�赽��[" + metadataReader.getClassMetadata().getClassName());
		if(metadataReader.getClassMetadata().getClassName().contains("Service")) {
			return true;
		}
		return false;
	}
}
