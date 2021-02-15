package day04_controlStatement;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		// 한 자리의 정수를 입력받아서 홀수인지 짝수인지 판별해보자
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		if(num < 0)
			num = -num;
		
		switch(num % 2) {
		case 0 : System.out.println("짝수"); break; 
		case 1 : System.out.println("홀수"); break; 
		}
	}
}
