package operator;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		
		// 연산자 : 데이터(변수, 상수, 함수) 간의 연산을 처리하는 기호 혹은 글자
		
		// 산술 연산 : +, -, *, /, %
		// +) 정수 + 정수, 정수 + 실수, 실수 + 실수 => 덧셈
		// 문자열 + 정수 혹은 실수 => 글자 이어붙이기
		
		System.out.println(1+2);
		System.out.println("1"+"2");
		
		// % : 나머지 연산
		// 1) 홀수 짝수 구분하기
		// 2) 배수/약수 구하기
		// 3) 2021 / 10 => 202, 2021 % 10 => 1, 정수의 자릿수를 구분하여 처리할 수 있다
		// 4) 난수의 범위 제한 (a % b = c, c는 절대 b보다 클 수 없다)
		
		Random r = new Random();	// java에서 난수를 생성하는 클래스
		int num = r.nextInt();
		System.out.println("num : " + num);
		
		int answer = num % 6;		// 6보다 작은 0~5까지의 정수가 나온다
		System.out.println("주사위 값 : " + (answer + 1));
		System.out.println();
		
		int n2 = 10;
		System.out.println(n2++);	// 먼저 n2의 값을 출력한 이후에 n2의 값을 1 증가시킨다
		System.out.println(++n2);	// 먼저 n2의 값을 1 증가시키고, n2의 값을 출력한다
		System.out.println(-n2);	// 변수 값에서 부호만 반전시켜서 출력한다
		System.out.println(-(-n2));	// n2의 값을 부호반전한 결과를 다시 부호반전한다
		
		int n3 = 0;
		int plus = 2;
		n3 = n3 + plus;
		System.out.println("n3 : " + n3);
		n3 += plus;
		System.out.println("n3 : " + n3);
		plus = -plus;	// plus의 값을 부호반전시켜 새로 저장
		n3 += plus;		// 음수 값을 더하는 건 뺄셈(-)와 동일하다
		System.out.println("n3 : " + n3);
		System.out.println();		
		// add a, b;		// a += b
		
		int n4 = 1;
		System.out.println(n4 *= 2);	// 1 * 2
		System.out.println(n4 *= 2);	// 1 * 2 * 2
		System.out.println(n4 *= 2);	// ...
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println(n4 *= 2);
		System.out.println();
		
		// 논리 연산 and
		int age = 15;		// 나이
		int gender = 1;		// 홀수는 남성, 짝수는 여성
		boolean goArmy = age >= 20 && gender % 2 != 0;
		System.out.println("현역 대상입니까 : " + goArmy);
		
		// 논리 연산 or
		int card = 50000;
		int cash = 0;
		boolean canRideTaxi = card >= 5000 || cash >= 5000;
		System.out.println("택시를 탈 수 있습니까 : " + canRideTaxi);
	}
}
