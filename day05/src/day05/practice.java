package day05;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		// 1) 1부터 100까지 정수의 합을 구하세요
		int n = 1, sum = 0;
		
		while(n <= 100) {
			sum = sum + n++;
		}
		System.out.println(sum);
		
		// 2) Hello, world!! 문자열을 5번 출력하세요
		String str = "Hello World!!";
		int n2 = 0;
		
		while(n2 < 5) {
			System.out.println(str);
			n2++;
		}

		// 3) Scanner를 이용하여 사용자에게 정수를 입력받으세요
		// 사용자가 0을 입력할 때까지 정수를 입력 받아서
		// 0을 입력 받고 나면 지금까지 입력 받은 모든 정수의 합을 출력하세요
		Scanner sc = new Scanner(System.in);
		int n3, sum2 = 0;
		
		while(true) {
			System.out.print("정수를 입력(0 입력시 종료) : ");
			n3 = sc.nextInt();
			if(n3 == 0) { 
				break;
			} else {
				sum2 = sum2 + n3;
			}
		}
		System.out.println(sum2);
		sc.close();
	}
}
