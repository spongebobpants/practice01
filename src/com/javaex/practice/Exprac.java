package com.javaex.practice;

public class Exprac {
	public static void main(String []args) {
		int x=1;
		int y=1;
		
		int a =++x *7/3; //4 ->x에 1을 먼저 더한다(++)=2 그 다음 7/3=>2이므로 2*2=4
		int b =y++ *7/3; //2
		
		System.out.println("a="+a);//a=3
		
		System.out.println("b="+b);//1
		System.out.println("x="+x);//x=2
		System.out.println("y="+y);//y=2 b에 먼저 올리고 그다음에 y->1
		/*x가 1일때 첫번째 
		 *x+1=2*7=14/3->4...(나머지)2 즉 a=4고 x는 이미 1을 더했으니까 2이다.
		 *y(1)*7=7/3=2...(나머지)1 즉 b는 2, y는 그 이후(b에 값이 출력된 후)에 1을 더했으니까 2이다.
		*/
		
	}

}
