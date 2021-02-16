package day05;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 반복할 작업을 while 안에 배치한다
		
		// 1) 1부터 100까지 정수의 합을 구하세요
		int num1 = 1;
		int total1 = 0;
		
		while(num1 <= 100) {
			total1 = total1 + num1++;	// 더하고 난 후에 값을 증가시킨다
		}
		System.out.println("합계 : " + total1);
		
		// 2) Hello, world!! 문자열을 5번 출력하세요
		String data = "Hello World!!";
		int n2 = 0;			// 초기값
		while(n2 < 5) {		// 반복조건
			System.out.println(data);
			n2 += 1;		// 증감식	// n2++ / n2 = n2 + 1
		}
		
		// 3) Scanner를 이용하여 사용자에게 정수를 입력받으세요
		// 사용자가 0을 입력할 때까지 정수를 입력 받아서
		// 0을 입력 받고 나면 지금까지 입력 받은 모든 정수의 합을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int n3, total2 = 0;
		
		while(true) {
			System.out.print("숫자 입력(0을 입력하면 종료) : ");
			n3 = sc.nextInt();
			if(n3 == 0) {
				break;
			}
			total2 = total2 + n3;	// total2 += n3
		}
		System.out.println("지금까지 입력한 수의 합계 : " + total2);
		
		sc.close();
	}
}
