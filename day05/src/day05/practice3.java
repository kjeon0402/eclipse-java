package day05;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		// 1) 점수를 입력받을 때, 입력받은 수의 범위가 0~100을 벗어나면 다시 입력받아서
		// 원하는 범위 내의 수를 화면에 출력하는 코드
		Scanner sc2 = new Scanner(System.in);
		int score;
				
		while(true) {
			System.out.print("점수를 입력(0~100) : ");
			score = sc2.nextInt();
			
			if(score >= 0 && score <= 100) {
				System.out.println(score); break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
				
		// 2) 정수형으로 숫자를 입력받아서, 거꾸로 뒤집은 값을 '정수형 변수에 저장'하여 출력
		// 나눗셈을 활용하세요(사용자가 몇자리의 정수를 입력할지 알 수 없다)
		int num, rev = 0;
		
		System.out.print("정수를 입력 : ");
		num = sc2.nextInt();
		
		while(true) {
			rev = (rev + num % 10) * 10;
			num = num / 10;
			
			if(num < 10) {
				rev = rev + num % 10; break;
			}
		}
		System.out.println(rev);
		sc2.close();
	}
}
