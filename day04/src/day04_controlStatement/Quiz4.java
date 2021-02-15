package day04_controlStatement;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		// 세 정수의 값을 각각 따로 입력 받은 후에
		// 가장 큰 값을 출력하세요
		// 추가로 변수를 선언해도 무방합니다
		int max = -210000000;
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		n3 = sc.nextInt();
		
		if(n1 > max) max = n1;
		if(n2 > max) max = n2;
		if(n3 > max) max = n3;
		
		
//		System.out.print("첫 번째 수를 입력하세요 : ");
//		n1 = sc.nextInt();
//		
//		System.out.print("두 번째 수를 입력하세요 : ");
//		n2 = sc.nextInt();
//		
//		System.out.print("세 번째 수를 입력하세요 : ");
//		n3 = sc.nextInt();
//		
//		if(n1 > n2 && n1 > n3) {
//			System.out.println("가장 큰 수 : " + n1);
//		} else if(n2 > n1 && n2 > n3) {
//			System.out.println("가장 큰 수 : " + n2);
//		} else if(n3 > n1 && n3 > n2) {
//			System.out.println("가장 큰 수 : " + n3);
//		}
		
		sc.close();
	}
}
