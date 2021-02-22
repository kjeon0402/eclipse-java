package day09;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 배열을 선언하고 배열의 길이만큼 사용자에게 값을 입력받아서 화면에 출력하는 예제
		
		Scanner sc = new Scanner(System.in);
		int length;
		
		System.out.print("생성할 배열의 길이 : ");
		length = sc.nextInt();
		
		int[] arr = new int[length];	// 배열 생성시 길이에 변수를 사용할 수 있다
		
		System.out.println("==== 입력 시작 ====");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("==== 출력 시작 ====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}
