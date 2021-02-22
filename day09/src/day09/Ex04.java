package day09;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		// 서로 다른 두 배열(길이가 같음)을 만들고, 같은 순번을 이용하여 데이터를 저장하고 출력하기
		
		String[] nameArr = new String[3];	// { null, null, null }
		int[] ageArr = new int[3];			// { 0, 0, 0 }
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 입력 ===");
		for(int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d번째 사람의 이름 : ", i);
			nameArr[i] = sc.next();
			System.out.printf("%d번째 사람의 나이 : ", i);
			ageArr[i] = sc.nextInt();
		}
		System.out.println("=== 출력 ===");
		// 이지은님의 나이는 29살입니다 => 이런 형식으로 입력 받은 사람의 데이터를 한번에 출력하는 for문 작성
		for(int i = 0; i < nameArr.length; i++) {
			System.out.printf("%s님의 나이는 %d살입니다.\n", nameArr[i], ageArr[i]);
		}
		sc.close();
	}
}
