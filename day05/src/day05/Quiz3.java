package day05;

public class Quiz3 {
	public static void main(String[] args) {
		// 첫날에 은행에 10원을 입금한다
		// 둘째날에는 전날의 두 배 금액인 20원을 입금한다
		// 셋째날에는 전날의 두 배 금액인 40원을 입금한다
		// 이런 식으로 은행에 돈을 임금했을 때
		// 30일이 경과한 이후 은행에 예치되어 있는 금액을 계산하여 출력하세요
		// 자료형에 주의하면서 코드를 작성할 것
		
		long bank = 0, money = 10;
		int day = 1;
		
		while(day < 31) {
			bank = bank + money;		// 준비한 금애글 입금한다
//			System.out.println("money : " + money + ", bank : " + bank);
			money = money * 2;			// 다음날을 위해 2배의 돈을 준비한다
			day++;						// 하루가 지나간다
		}
		System.out.printf("은행 : %,d원\n", bank);
	}
}
