package com.spellhaven.springtest2050902;

import java.util.ArrayList;

public class MyBMI {

	private String name;	
	private double weight;
	private double height;
	
	private BMICalculator bmiCalcu;	
	private ArrayList<String> hobbies; // 이건 필요 없는데, 그냥 arraylist 세팅을 어떻게 하나 연습용이다.
	
	
	public void mybmiCalculation() {
		bmiCalcu.bmiCalculation(weight, height);
	}
	
	public void printInfo() {		
		System.out.println("이름: " + name);
		System.out.println("샤이니 키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("취미: " + hobbies);
		
		mybmiCalculation();
	
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BMICalculator getBmiCalcu() {
		return bmiCalcu;
	}

	public void setBmiCalcu(BMICalculator bmiCalcu) {
		this.bmiCalcu = bmiCalcu;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
		
	
	
}
