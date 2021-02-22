package day08;

import java.util.Scanner;

public class Ex02 {
	
	static boolean isEven(int num) {
		return num % 2 == 0;
	}
	static boolean isEven(String num) {
		return Integer.parseInt(num) % 2 == 0;
		// Integer.parseInt("1234") => 1234, 문자열로 되어 있는 정수를 정수로 바꾸는 역할
	}
//	static String isEven(int num) {		// 반환형은 오버로딩에 영향을 줄 수 없다. 매개변수만으로 판단한다
//		return num % 2 == 0 ? "true" : "false";
//	}
	
	public static void main(String[] args) {
		
		boolean flag1 = isEven(432682512);
		boolean flag2 = isEven("123456789");
		
		System.out.println(flag1 + ", " + flag2);
		
		String text = "안녕하세요\n오늘은 2021년 2월 19일입니다.\n";
		
		Scanner sc1 = new Scanner(System.in);	// Scanner(InputStream source)
		Scanner sc2 = new Scanner(text);		// Scanner(String source)
		// 오버로딩 되어 있는 Scanner를 생성하는 함수
		
	}
}
