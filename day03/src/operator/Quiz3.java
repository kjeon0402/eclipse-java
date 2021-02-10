package operator;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 두 정수와 부호를 입력받아 답을 출력하는 코드
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫 번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		sc.close();
	}
}
