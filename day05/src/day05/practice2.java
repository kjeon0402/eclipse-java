package day05;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		// 첫날에 은행에 10원을 입금한다
		// 둘째날에는 전날의 두 배 금액인 20원을 입금한다
		// 셋째날에는 전날의 두 배 금액인 40원을 입금한다
		// 이런 식으로 은행에 돈을 임금했을 때
		// 30일이 경과한 이후 은행에 예치되어 있는 금액을 계산하여 출력하세요
		// 자료형에 주의하면서 코드를 작성할 것
		long money = 10, bank = 0;
		int day = 1;
		
		while(day < 31) {
			bank = bank + money;
			money = money * 2;
			day++;
		}
		System.out.printf("%,d\n", bank);
		
		// ########## 100% ##########
		
		// 위 형식의 설치 진행률 표시를 만들려고 한다
		// 진행률을 정수로 입력받아서 개수에 따라서 # 기호가 출력되고
		// 진행률 숫자는 가운데 출력되는 형식을 만드세요
		// # 기호 하나는 5%를 의미합니다
		Scanner sc = new Scanner(System.in);
		int per, cnt;
		
		System.out.print("숫자를 입력 : ");
		per = sc.nextInt();
		
		for(cnt = 0; cnt < 20; cnt++){
			if(cnt == 10) {
				System.out.printf(" %s %% ", per);
			}
			if(cnt < per / 5) {
				System.out.print("#");
			} else {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
