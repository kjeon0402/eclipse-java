package day04_controlStatement;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		// 다음 제시되는 시간 당 요금표를 참조하여 시간을 입력받고 이용 요금을 출력해보자
		//  0 ~ 30 분 : 3000
		// 31 ~ 40분 : 3500
		// 41 ~ 50분 : 4000
		// .
		// .
		// .
		
		Scanner sc = new Scanner(System.in);
		int minute, charge = 0;
		
		System.out.print("시간을 입력하세요(분) : ");
		minute = sc.nextInt();
		
		// 기본요금인 경우 or 아닌 경우
		if(minute > 0 && minute <= 30) { 
			charge = 3000;
		} else if(minute > 30) {
			if(minute % 10 == 0) {
				charge = 3000 + (((minute - 30) / 10) + 0) * 500;
			} else { 
				charge = 3000 + (((minute - 30) / 10) + 1) * 500;
			}
		}
//		int overTime = minute - 30;
//		int overCost = (overTime / 10 + (overTime % 10 == 0 ? 0 : 1)) * 500;
//		
//		if(minute > 0)		charge = 3000;
//		if(minute > 30)		charge += overCost;
//		
		System.out.println("요금 : " + charge);
		
		sc.close();
	}
}
