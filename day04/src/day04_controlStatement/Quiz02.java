package day04_controlStatement;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 사용자에게 시간을 분 단위로 입력받아서
		// 60분 미만이면 "mm분입니다."라고 출력하고
		// 60분 이상이면 "hh시간 mm분입니다."라고 출력해보자
		
		Scanner sc = new Scanner(System.in);
		int minute;
		
		System.out.print("분 : ");
		minute = sc.nextInt();
		
		if(minute < 60) { 
			// 제어문이면, 한줄에 쓰면서 {}을 생략하는 경우가 많다 : return, break
			System.out.printf("%2d분입니다.\n", minute);
		} else {
			System.out.printf("%2d시간 %02d분입니다.\n", minute / 60, minute % 60);
		}
		sc.close();

//		hour = min / 60;
//		restMin = min % 60;
//		
//		if(min < 60 && min >= 0) {
//			System.out.printf("%d분입니다.\n", min);
//		} else if(min >= 60) {
//			System.out.printf("%d시간 %d분입니다.\n", hour, restMin);
//		} else {
//			System.out.println("잘못된 입력값입니다.");
//		}
//		sc.close();
	}
}
