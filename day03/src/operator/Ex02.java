package operator;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		String[] arr = {"Spring", "NodeJS", "Django", "Laravel"};
		Scanner sc = new Scanner(System.in);
		String input;
		boolean flag = false;
		
		System.out.print("공부하고 싶은 과정을 입력하세요 : ");
		input = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				flag = true;
			}
		}
		
		System.out.println(flag ? "수강가능" : "개설된 과목이 없습니다.");		// 3항 연산자
		sc.close();
	}
}
