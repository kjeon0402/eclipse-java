package day06;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("첫번째 정수를 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 : ");
		n2 = sc.nextInt();
		
		// 입력받은 두 정수 사이의 합을 구하여 출력하세요
		// n1과 n2의 대소관계는 정해져 있지 않습니다
		// 3과 5를 입력하면 3 + 4 + 5 = 12
		// 3과 3을 입력하면 3
		// 5와 3을 입력하면 3 + 4 + 5 = 12
		// 입력받는 정수의 범위는 -10,000,000에서 10,000,000
		
		sc.close();
	}
}
