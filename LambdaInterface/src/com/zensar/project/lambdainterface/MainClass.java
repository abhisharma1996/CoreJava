package com.zensar.project.lambdainterface;

public class MainClass {

	public static void main(String[] args) {
		FunctionalInterface1 ref1=()->System.out.println("Hello World");
		ref1.greetUser();
		
		Functionallnterface2 ref2=(a,b)->a+b;
		System.out.println(ref2.add(100,200));
	}

}
