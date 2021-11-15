package com.javaex.practice;
import java.util.Scanner;


public class Ex14 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("가로를 입력하세요: ");
		double width=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("세로를 입력하세요: ");
		double height=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("사각형의 넓이는 "+width*height);
		System.out.println("사각형의 둘레는 "+(width*2+height*2));
		
		sc.close();
		
	}

}
