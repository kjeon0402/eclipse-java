package day05;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 1) 점수를 입력받을 때, 입력받은 수의 범위가 0~100을 벗어나면 다시 입력받아서
		// 원하는 범위 내의 수를 화면에 출력하는 코드
		
		int score;
		
		while(true) {			
			System.out.print("점수를 입력하세요(0~100) : ");
			score = sc.nextInt();
			
			if(score >= 0 && score <= 100) {
				System.out.println("입력한 점수 : " + score); break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
		
		// 2) 정수형으로 숫자를 입력받아서, 거꾸로 뒤집은 값을 '정수형 변수에 저장'하여 출력
		// 나눗셈을 활용하세요(사용자가 몇자리의 정수를 입력할지 알 수 없다)
		
		// while : 반복의 조건이 횟수가 아닐 경우
		// for : 명확한 횟수가 정해져 있는 경우
		
		int i, num, rev = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		i = sc.nextInt();
		num = i;
		
		while(true) {			// 입력값이 1234라고 가정
			rev = rev + i % 10;	// 단순 대입은 값을 덮어쓰기 때문에, 누적 합산으로 처리한다(4)
			i = i / 10;			// 이미 사용한 자릿수를 제거한다(123)
			if(i == 0) {
				break;
			}
			rev = rev * 10;		// rev = 40
		}
		System.out.println("자릿수를 거꾸로 뒤집으면 : " + rev);
		
		// 출력만 하는 경우
		while(num != 0) {
			System.out.print(num % 10);
			num = num / 10;
		}
		System.out.println();
		
		sc.close();
	}
}
