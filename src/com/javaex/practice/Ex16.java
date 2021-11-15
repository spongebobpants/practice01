package com.javaex.practice;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("상품가격: ");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("받은돈: ");
		double get=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("=================");
		
		System.out.println("받은돈:"+get);
		System.out.println("상품가격: "+price);
		
		System.out.println("부가세: "+(price*0.1));
		System.out.println("잔액: "+(get-price));
		
		sc.close();
		
	}

}
