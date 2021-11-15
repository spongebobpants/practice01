package com.javaex.practice;
import java.util.Scanner;

public class Ex18 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("화씨: ");
		double hwa=sc.nextDouble();
		double sub=((5.0/9.0)*(hwa-32));
		sc.nextLine();
		
		
		System.out.println("화씨"+hwa+"의 섭씨온도는 "+sub+"입니다 ");
		
		
		
		
		sc.close();
	}

}
