package day04_controlStatement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// if문을 나열된 순서대로 실행된다
		// 나이를 입력받아서 성인/미성년자를 구분하는 코드를 if로 작성해보자
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이를 입력 : ");
		age = sc.nextInt();
		
		if(age >= 20) { 	// 만약, age의 값이 20보다 크거나 같으면
			System.out.println("성인입니다.");	// 성인입니다.를 화면에 출력해라
			System.out.println("조건이 참인 경우");
		} else {	// 아니라면(age가 20보다 작으면)
			System.out.println("미성년자입니다.");	// 미성년자입니다.를 화면에 출력해라
			System.out.println("조건이 거짓인 경우");
		}
		
		// 만약 if문의 실행코드가 한줄인 경우에는 {} 범위 블럭을 생략할 수 있다
		if(age == 0)	System.out.println("잘못된 입력입니다.");
		
		sc.close();
	}
}
