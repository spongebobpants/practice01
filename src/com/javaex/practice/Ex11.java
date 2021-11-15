package com.javaex.practice;
import java.util.Scanner;

public class Ex11 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("월급을 입력하세요");
		int pay=sc.nextInt();
		sc.nextLine();
		System.out.println("10년동안 최대 저축액은"+(pay*120)+"만원입니다.");
		
		
		
		sc.close();
	} 

}
