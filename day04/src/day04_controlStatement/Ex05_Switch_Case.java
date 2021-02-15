package day04_controlStatement;

import java.util.Scanner;

public class Ex05_Switch_Case {
	public static void main(String[] args) {
		
		// switch ~ case : 특정 변수의 값이 어떤 값이냐에 따라 분기를 나누는 제어문
		
		int num; 
		final int tmp = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num == 1) 		System.out.println("num은 1");
		else if(num == 2) 	System.out.println("num은 2");
		else if(num == 3) 	System.out.println("num은 3");
		else 			 	System.out.println("num은 1도 2도 3도 아니다.");
		
		// switch의 case는 상수만 올 수 있다
		// switch의 case는 코드가 시작되는 지점만 지정할 뿐 끝나는 지점을 정해두지 않는다 => break 쓰는 이유
		switch(num) {
			case tmp : System.out.println("num은 1"); break;
			case 2 : System.out.println("num은 2"); break;
			case 3 : System.out.println("num은 3"); break;
			default : System.out.println("num은 1도 2도 3도 아니다."); break;
		}
		sc.close();
	}
}
