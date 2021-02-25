package day10;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				for(int j = 0; j < arr.length; j++) {
					sum = sum + arr[j];
				}
				System.out.println("합계  : " + sum);
				break;
			}
			if(i == arr.length - 1) {
				int[] tmp = new int[arr.length + 3];
				for(int j = 0; j < arr.length; j++) {
					tmp[j] = arr[j];
				}
				arr = tmp;
			}
			System.out.print("arr : ");
			for(int j = 0; j <= i; j++) {
				System.out.printf("%d ", arr[j]);
			}
			System.out.println();
		}
		sc.close();
		
		
		
		// 기본 크기 3으로 int형 배열을 생성하세요
		// Scanner를 이용하여 사용자에게 정수를 입력받습니다
		// 정수형 배열의 각 멤버변수는 자동초기화에 의해서 0을 가지게 됩니다
		// 사용자에게 정수를 하나씩 입력받아서 배열에 순서대로 저장합니다
		// 만약, 배열이 꽉 차서 더이상 값을 받을 수 없으면
		// 기존 배열보다 3만큼 크기가 더 큰 신규 배열을 생성해서
		// 기존 배열의 데이터를 신규 배열에 복사하고
		// 다시 사용자에게 데이터를 입력받아서 배열을 채워나갑니다
		// 입력받지 않은 공간은 0을 가지는데, 사용자가 0을 입력했다면 종료의 신호로 받아들이고
		// 반복문을 종료한 후에 지금까지 입력한 정수의 합을 출력하고 프로그램을 종료하면 됩니다
		// 입력을 받을 때 마다, 현재까지 입력한 정수를 한 줄에 출력하도록 처리하세요
		
	}
}
