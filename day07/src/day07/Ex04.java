package day07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length, space, star;
		
		while(true) { 
			System.out.print("길이 : ");
			length = sc.nextInt();
			if(length % 2 != 0) {
				star = 1;
				space = length - star * 2;
				break;
			}
			System.err.println("홀수를 입력해야 합니다.");
		}
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			for(int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {
				if(star + j == length) {
					break;
				}
				System.out.print("* ");
			}
			if(i < length / 2) {
				space = space - 2;
				star++;
			} else {
				space = space + 2;
				star--;
			}
			System.out.println();
			sc.close();
		}
		
	}
}
