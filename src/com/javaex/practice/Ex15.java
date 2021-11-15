package com.javaex.practice;
import java.util.Scanner;

public class Ex15 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("마일을 입력하세요 : ");
		double mile=sc.nextDouble();
		sc.nextLine();
		System.out.println(mile+"마일은"+(mile*1.609)+"킬로미터입니다.");
		
		sc.close();
		
		
	}

}
