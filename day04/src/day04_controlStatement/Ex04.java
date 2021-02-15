package day04_controlStatement;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 10;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
//		if(num > 0) {
//			if(num % 2 == 0) {
//				System.out.println("num은 양수이며, 짝수이다");
//			} else {
//				System.out.println("num은 양수이며, 홀수이다");
//			}
//		} else {
//			if(num % 2 == 0) {
//				System.out.println("num은 음수이며, 짝수이다");	
//			} else {
//				System.out.println("num은 음수이며, 홀수이다");
//			}
//		}
		if(num > 0 && num % 2 == 0)			System.out.println("num은 양수이며, 짝수이다");
		else if(num > 0 && num % 2 != 0) 	System.out.println("num은 양수이며, 홀수이다");
		else if(num <= 0 && num % 2 == 0)	System.out.println("num은 음수이며, 짝수이다");
		else if(num <= 0 && num % 2 != 0) 	System.out.println("num은 음수이며, 홀수이다");
		
		sc.close();
	}
}
