package cn.baoxin.annotation.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("assemble1")
public class Assemble {
	private String lable = "1";
	@Override
	public String toString() {
		return "Assemble [lable=" + lable + "]";
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
}
