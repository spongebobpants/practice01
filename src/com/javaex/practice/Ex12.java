package com.javaex.practice;
import java.util.Scanner;

public class Ex12 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("반지름을 입력하세요: ");
		int r=sc.nextInt();
		sc.nextLine();
		System.out.println("원의 넓이는"+(r*r)*3.14);
		
	sc.close();
	}

}
