package com.spellhaven.springtest2050902;

public class BMICalculator {
	
	private double lowWeight; // 저체중 기준 BMI 지수
	private double normalWeight; // 정상체중 기준 BMI 지수
	private double overWeight; // 과체중 기준 BMI 지수
	private double obesityWeight; // 비만 기준 BMI 지수
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01; // 키를 미터 기준으로 바꿔 보자.
		double result = weight / (h*h); // 몸무게/미터 기준 키의 제곱이 BMI 지수(BMI 깜찍이) 구하는 식이다. 그냥... 이런 게 있다... 
	
		System.out.println("당신의 BMI 지수는 " + result + "입니다, ㅋ");
		
		// 사실 이 식을 잘못 만들었긴 한데, 우리가 제대로 된 BMI 계산기를 만들려고 하는 것도 아니고 그냥 DI 연습이니까... "그냥 가자"
		if(result > obesityWeight) {
			System.out.println("비만입니다");
		} else if(result > overWeight) {
			System.out.println("과체중입니다");
		} else if(result > normalWeight) {
			System.out.println("정상체중입니다");
		} else {
			System.out.println("저체중입니다");
		} 		
	}

	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesityWeight(double obesityWeight) {
		this.obesityWeight = obesityWeight;
	}
	
	
	
}
