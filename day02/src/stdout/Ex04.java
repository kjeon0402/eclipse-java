package stdout;

public class Ex04 {
	public static void main(String[] args) {
		
//		System.out.printf() 함수는 서식에 맞추어서 값을 출력하는 함수이다
		
		String test = "ITBANK";
		System.out.println("test : " + test);
		System.out.printf("test : %s\n", test);
		
//		서식 제어 문자 (서식 문자) : 값을 출력하기 위한 빈 칸을 지정하며, 값의 자료형에 따라 다른 서식문자가 사용된다
		
//		%s : String, 문자열을 출력하는 서식문자
//		%d : decimal, 정수를 10진수의 형식으로 출력하는 서식문자
//		%c : char, 단일 글자를 출력하는 서식문자
//		%f : floating number, 부동 소수점 방식의 실수를 출력하는 서식문자
//		%x : hexadecimal, 정수를 16진수 형식으로 출력하는 서식문자
//		%o : octal, 정수를 8진수 형식으로 출력하는 서식문자
		
		char ch = '힇';
		System.out.printf("%c의 코드는 %d입니다.\n", ch, (int)ch);
		
//		for(int i = 44032; i<55203; i++) {
//			System.out.printf("[%c]의 코드는 [%d]입니다.\n", (char)i, i);
//		}
		
		String name1 = "Tony";
		String name2 = "Steve";
		String name3 = "Krystal";
		String name4 = "Dicaprio";
		
		System.out.printf("이름 : %10s\n", name1);
		System.out.printf("이름 : %10s\n", name2);
		System.out.printf("이름 : %10s\n", name3);
		System.out.printf("이름 : %10s\n", name4);
		
		int month1 = 5;
		int month2 = 12;
		
		System.out.printf("%2d월 %3d일입니다.\n", month1, 5);
		System.out.printf("%2d월 %02d일입니다.\n", month2, 11);
		
		double avg = (100 + 99 + 87) / 3.0;
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);
	}
}
