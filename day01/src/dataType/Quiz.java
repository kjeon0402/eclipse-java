package dataType;

public class Quiz {
	public static void main(String[] args) {
		
		byte by = 10;		// 컴퓨터의 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)
		short sh = 20;		// 정수와 정수를 연산하면 결과는 정수이다
		char ch = 65;		// 실수와 실수를 연산하면 결과는 실수이다
		int num = 30;		// 정수와 실수를 연산하면 결과는 실수이다
		long lo = 40L;		// 10 + 20 = 30
		float fl = 3.14F;	// 10 / 3 = 3	
		double db = 65.56;	// 10 % 3 = 1
		
		int a = by;			//	(4) = (1)
		char b = (char)db;	// 	(2) = (8), 준비된 변수보다 데이터의 크기가 더 크다, 정수 변수에 실수 데이터를 넣으면 소수점 이하가 잘린다
		long c = sh;		//	(8) = (2)
		float d = num;		// 	(4) = (4)
		short e = (short)ch;// 	(2) = (2), 크기는 같으나, 표현 범위가 달라서 데이터가 잘릴 수 있다
		double f = by;		// 	(8) = (1)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.printf("평균 : %d점\n", (100 + 99 + 87) / 3);
		System.out.printf("평균 : %.2f점\n", (100 + 99 + 87) / (double)3);
		System.out.printf("평균 : %.2f점\n", (100 + 99 + 87) / 3.0);
	}
}




