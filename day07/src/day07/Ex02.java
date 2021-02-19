package day07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 우측 하단이 직각인 이등변 삼각형
		Scanner sc = new Scanner(System.in);
		int length;	// 길이
		int space;	// 공백의 개수
		int star; 	// 별의 개수
		
		System.out.print("길이 입력 : ");
		length = sc.nextInt();
		star = 1;
		space = length - star;
		
		System.out.println();
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			star++;
			space--;
			System.out.println();	
		}
		sc.close();
	}
}
