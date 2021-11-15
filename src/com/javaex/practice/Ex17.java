package com.javaex.practice;
import java.util.Scanner;

public class Ex17 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("반지름: ");
	double radius=sc.nextDouble();
	double V=(4.0/3.0)*Math.PI*radius*radius*radius;
	
	sc.nextLine();
	
	System.out.println("부피 :"+V+"입니다 ");
	
	
	

	
	
	
	sc.close();
}
}
