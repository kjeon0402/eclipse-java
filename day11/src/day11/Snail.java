package day11;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		
		// 정수를 입력받아 그 정수를 크기로 하는 Snail 모양 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();	// 길이
		int n = 0;				// 대입할 값
		int a = -1, b = 0;		// 가로, 세로
		int sign = 1;			// 부호
		
		int[][] arr = new int[num][num];
		
		while(true) {
			for(int i = 0; i < num; i++) {	
				a = a + sign;
				arr[b][a] = ++n;
			}
			num = num - 1;		// 길이 감소
				
			if(num == 0) break;
				
			for(int i = 0; i < num; i++) {
				b = b + sign;
				arr[b][a] = ++n;
			}
			sign = sign * -1;	// 증감 반전(부호 반전)
		}
			
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		sc.close();
	}
		
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				while(true) {
//					arr[i][j] = ++n;
//					if(j == 4) {
//						
//					}
//				}
//			}
//		}
		
}

