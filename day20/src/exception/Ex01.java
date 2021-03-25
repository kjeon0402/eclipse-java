package exception;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException{
		// 프로그램 진행시의 다양한 요인을 미리 가정하고, 문제가 발생하면 어떻게 처리할지 명시하는 내용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
		String num = sc.next();
		boolean flag = false;
		
		for(char ch : num.toCharArray()) {
			if('0' <= ch && ch <= '9' || ch == '-') {
				// 정수가 맞음
				flag = true;
			} else {
				// 정수가 아님
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("입력한 정수는 " + num);
		else
			System.out.println("정수가 아닌 값을 입력했습니다.");
		
//		System.out.println("입력한 정수는 " + num);
		
		// =====================================
		// 사용자에게 입력을 받는다는 것 자체에서 수많은 예외 발생 가능성이 존재한다
		// 문법 상의 문제가 아니라 진행 상의 문제
		
//		System.out.print("정수 입력 : ");
//		num = System.in.read();
		
		sc.close();
	}
}
