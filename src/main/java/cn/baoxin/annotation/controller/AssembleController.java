package cn.baoxin.annotation.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import cn.baoxin.annotation.bean.Assemble;

@Controller
public class AssembleController {
//	@Qualifier("assemble2")
//	@Autowired
	@Resource(name="assemble2")
	private Assemble assemble;
	public void service() {
		System.out.println(assemble);
	}
}
