package recursive;

public class Ex02 {
	// while 반복
	static int getFactorial_while(int num) {
		
		int factorial = 1;
		
		while(true) {
			factorial = factorial * num--;
			if(num == 0) break;		// 무한반복을 중단할 조건
		}		
		return factorial;
	}
	
	// 재귀함수
	static int getFactorial_recursive(int num) {
		if(num == 1)
			return 1;
		else
			return num * getFactorial_recursive(num -1);
	}
	
	public static void main(String[] args) {
		
		int test1 = getFactorial_while(5);
		int test2 = getFactorial_recursive(5);
		
		System.out.println(test1);
		System.out.println(test2);
		
		
		// 팩토리얼 구하기
		// 팩토리얼 : 정수 n에 대하여, n * (n - 1) * (n - 2) *  ... * 1까지의 누적 곱셈 결과
		// 팩토리얼은 n!형식으로 표기하며, 
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		
	}
}
