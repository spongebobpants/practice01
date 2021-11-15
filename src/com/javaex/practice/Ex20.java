package com.javaex.practice;
import java.util.Scanner;

public class Ex20 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("500원 개수 : ");
		int fvhund =sc.nextInt();
		System.out.print("100원 개수 : ");
		int hund=sc.nextInt();
		System.out.print("50원 개수 : ");
		int fifth=sc.nextInt();
		System.out.print("10원 개수 : ");
		int ten=sc.nextInt();
		
		System.out.println("동전의 총합은 "+(500*fvhund+100*hund+50*fifth+10*ten)+"원 입니다. ");
		
		
		sc.close();
		
		
	}

}
