package com.spellhaven.springtest2050902;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
				
		String configPath = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configPath);
		// 스프링 컨테이너 ctx 생성
		
		MyBMI mybmi = ctx.getBean("myBMI", MyBMI.class);
		mybmi.printInfo();
		
		ctx.close(); // 스캐너의 추억이 생각나는군요. 여튼 AbstractApplicationContext 얘도 쓰고 다음 사람을 위해 꼭 닫아 주자.	
		
		/*
		 // 원래 자바에서는 이렇게 했었다.
		 BMICalculator bmical = new BMICalculator();		
		 MyBMI mybmi = new Mybmi();
		 
		 mybmi.setBmiCalcu(bmical);
		*/ 
	}

}
