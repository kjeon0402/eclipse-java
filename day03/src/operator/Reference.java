package operator;

import java.util.Scanner;

public class Reference {
	public static void main(String[] args) {
		
		// 참조변수를 비교하는 형식
		Scanner sc = new Scanner(System.in);
		
		String test1, test2, test3;	
		// 참조 변수 형식 : 데이터가 위치하는 메모리 상의 주소를 상징하는 값을 저장
		
		test1 = "apple";	// "apple"이라는 리터럴 상수의 참조값을 저장
		test2 = "apple";	// 이미 "apple"이라는 리터럴이 있기 대문에 새로 생성하지 않고, 
							// 기존의 "apple"의 참조값을 그대로 저장
		
		System.out.print("apple이라고 입력하세요 : ");
		test3 = sc.next();	// 사용자 입력이 "apple"일지 아닐지 예측할 수 없다
							// 별도의 공간을 마련하고, 그 안에 사용자 입력값을 저장
		
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);
		System.out.println("test3 : " + test3);
		
		System.out.println("test1 == test2 : " + (test1 == test2));
		System.out.println("test1 == test3 : " + (test1 == test3));
		System.out.println("test2 == test3 : " + (test2 == test3));
		System.out.println("test2.equals(test3) : " + test2.equals(test3));	// 문자열을 비교할 때는 equals 사용
		
		test3 = "apple";
		System.out.println("test3 = \"apple\";");
		System.out.println("test2 == test3 : " + (test2 == test3));
		
		String test4 = new String("apple");
		// 새로운 공간을 할당해서(이미 주소가 다름) 문자열을 만들어라
		System.out.println("test1 == test4 : " + (test1 == test4));
		
		sc.close();
	}
}
