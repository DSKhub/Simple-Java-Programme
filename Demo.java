package com.practical.daily.topic;

public class Demo {
	public static void main(String[] args) {
		aaaa a=new aaaa();
		a.m1(10.27);
	}
}
class aaaa{
	void m1(double o){ System.out.println("Class A -M1() Method  double:");}
	void m1(float s){System.out.println("Class A-M2() Method  float");}
}