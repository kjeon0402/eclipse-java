package day11;

import java.util.Scanner;

// while을 이용하여 메뉴를 선택하고 그에 맞게 실행되는 프로그램
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu = 0, total = 0;
		
		do {
			System.out.println("1. 콜라 : 800");
			System.out.println("2. 사이다 : 700");
			System.out.println("3. 이온음료 : 1000");
			System.out.println("0. 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					total = total + 800;
					System.out.println("==콜라 판매됨!!=="); 	break;
				case 2: 
					total = total + 700;
					System.out.println("==사이다 판매됨!!=="); 	break;
				case 3: 
					total = total + 1000;
					System.out.println("==이온음료 판매됨!!=="); 	break;
				// case에서 내가 만든 함수를 호출하도록 처리할 수 있다
			}
		} while(menu != 0);
		
		System.out.println("이용해주셔서 감사합니다");
		System.out.printf("오늘 판매한 총 금액은 %,d원입니다.\n", total);
		sc.close();
	}
}
