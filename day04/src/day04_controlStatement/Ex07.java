package day04_controlStatement;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		// 주민등록번호 7번째 숫자를 받아서 몇 년대 출생인지 출력해보자
		// 9, 0 : 1800
		// 1, 2 : 1900
		// 3, 4 : 2000
		
		int num, year = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 7번째 숫자 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 9 : case 0 : 
			year = 1800; 
			break;
		case 1 : case 2 : 
			year = 1900; 
			break;
		case 3 : case 4 : 
			year = 2000; 
			break;
		}
		
		System.out.println(year != 0 ? year + "년대 출생자입니다." : "잘못된 입력입니다.");
		
		sc.close();
	}
}
