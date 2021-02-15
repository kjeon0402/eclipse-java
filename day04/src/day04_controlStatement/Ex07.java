package day04_controlStatement;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		// 주민등록번호 7번째 숫자를 받아서 몇 년대 출생인지 출력해보자
		// 9, 0 : 1800
		// 1, 2 : 1900
		// 3, 4 : 2000
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 7번째 숫자 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 9 : System.out.println("1800년대 출생자입니다."); break;
		case 0 : System.out.println("1800년대 출생자입니다."); break;
		case 1 : System.out.println("1900년대 출생자입니다."); break;
		case 2 : System.out.println("1900년대 출생자입니다."); break;
		case 3 : System.out.println("2000년대 출생자입니다."); break;
		case 4 : System.out.println("2000년대 출생자입니다."); break;
		}
		sc.close();
	}
}
