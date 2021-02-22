package day09;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 2021년 2월 1일은 월요일입니다
		// 날짜(일)을 입력받아서 요일을 출력하려면 어떻게 할까요?(1 ~ 28)
		
		Scanner sc = new Scanner(System.in);
		int date = 1;	// 테스트하기 위해 미리 값을 넣어 뒀음
		do { 
			System.out.print("몇 일(1 ~ 28) : ");
			date = sc.nextInt();
		} while(date < 1 || date > 28);
		
		
		//						[0]  [1]  [2]  [3]  [4]   [5]   [6]
		String[] dayOfWeek = { "일", "월", "화", "수", "목", "금", "토" };
		
		System.out.printf("2021년 2월 %d일은 %s요일입니다.\n", date, dayOfWeek[date % 7]);
		sc.close();
		
		// 어떤 값이든 7로 나누었을 때 나머지는 7미만이다(0 ~ 6)
	}
}
