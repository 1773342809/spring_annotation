package cn.baoxin.annotation.importor;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ���ݷ��ص�ָ�����ȫ�������飬����bean�����Զ�ע�ᵽ������
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {"cn.baoxin.annotation.bean.GoodsDetails"};
	}
}
