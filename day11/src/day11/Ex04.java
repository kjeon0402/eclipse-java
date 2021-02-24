package day11;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 학생의 국영수 점수와 합계를 저장하는 배열을 만듭니다
		// 출석번호에 따라서 저장하고 최초 실행 시에 몇 명의 학생을 저장할 지 물어봅니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명 : ");
		int count = sc.nextInt();
		int length = 4;		// 세 과목 + 합계
		
		int[][] arr = new int[count][length];
		
		for(int i = 0; i < arr.length; i++) {	// count
			for(int j = 0; j < arr[i].length - 1; j++) {	// length - 1, 마지막은 합계를 넣을 것
				String subject = null;
				switch(j) {
				case 0: subject = "국어"; break;
				case 1: subject = "영어"; break;
				case 2: subject = "수학"; break;
				}
				System.out.printf("%d번째 학생 %s 점수 입력 : ", i + 1, subject);
				arr[i][j] = sc.nextInt();
				arr[i][3] = arr[i][3] + arr[i][j];	// 3은 arr[i].length - 1
			}
			System.out.println();
		}
		// 어떤 모양으로 저장되어 있는가
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생의 평균은 %.2f점입니다.\n", i + 1, arr[i][3] / 3.0);
		}
		sc.close();
	}
}
