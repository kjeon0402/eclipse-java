package dataType;

public class Ex02 {
	public static void main(String[] args) {
		
		boolean bo = true;		// 논리값, 조건
		
		byte by = 127;
		short sh = 32767;
		char ch = 66;			// 단일 문자를 나타내기 위한 자료형
		int num = 1234;			// 정수의 기본 자료형
		long ln = 2200000000L;	// 그냥 적으면 int 인줄 아니까 대문자 혹은 소문자로 L을 값 뒤에 붙여준다
		
		float fl = 1.2f;		// 그냥 적으면 double 인줄 아니까 대문자 혹은 소문자로 F를 값 뒤에 붙여준다
		double db = 3.14;		// 실수의 기본 자료형
		
		by = (byte)(by + 1);	// 표현 범위가 -128 ~ +127 사이이므로, 범위를 벗어나면 순환한다
		
		System.out.println("bo : " + bo);
		System.out.println("by : " + by);
		System.out.println("sh : " + sh);
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		System.out.println("ln : " + ln);
		System.out.println("fl : " + fl);
		System.out.println("db : " + db);
		
		char ch2 = '가';		// char 변수에 글자를 하나 담으려면 홑따옴표를 이용한다
							// 홑따옴표는 단일 문자(char), 쌍따옴표는 문자열(String)
		System.out.println(ch2);
		
		int num2 = ch2;
		System.out.println(num2);
		System.out.println((char)44100);
		
		int test;	// 초기화 하지 않은 변수는 사용할 수 없다
//		The local variable test may not have been initialized
//		System.out.println(test);
		
		// 진법 : 숫자를 표현할 때 사용 가능한 기호가(글자가) 몇개인지에 따라 진법을 나눈다
		
		// 0과 1로만 표현하는 진법은 2진법
		// 0부터 7까지 사용하는 진법은 8진법
		// 0부터 9까지 사용하는 진법은 10진법
		// 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F 를 사용하는 진법은 16진법
		
		// 2진법으로 표기하는것이 가장 컴퓨터의 내부와 가까운 표현이지만, 길이가 너무 길어져서 보기 불편하다
		// 16진법으로 표기하면 비교적 간결하게 내용을 출력할 수 있다
		
		// 1111 1111(2) : 255
		// FF(16) : 255
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
