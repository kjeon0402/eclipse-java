package day05;

public class Ex01_While {
	public static void main(String[] args) {
		
		int num = 10;
		
		// 조건이 참이면 코드를 실행하고, 블럭을 빠져나간다
		if(num < 20) {
			System.out.println("if : " + ++num);
		}
		
		// 조건이 참이면 코드를 실행하고, 다시 조건을 체크하여 반복실행한다
		while(num < 20) {
			System.out.println("while : " + ++num);
		}
		
		// 조건이 항상 참이면, 무한 반복에 빠질 수 있다
		while(true) {
			System.out.println("infinite loop!! : " + ++num);
			if(num > 100000) { 
				break;	// if는 대상에서 제외, switch, while, for 문의  {}을 아래로 빠져나간다
//				num = 1;
//				continue;	// {} 블럭의 위쪽으로 빠져나간다 -> 코드는 위에서 아래로 진행하므로 조건을 다시 체크
			}
		}
	}
}
