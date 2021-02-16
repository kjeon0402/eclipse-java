package day05;

public class Quiz4 {
	public static void main(String[] args) {
		
		// 1) 1에서 10까지 2씩 증가하는 반복 구간에서 각 숫자를 한 줄에 출력하세요
		for(int i = 1; i <= 10; i += 2) {
			System.out.printf("%s ", i);
		}
		System.out.println();
		
		// 2) 10에서 20까지 3씩 증가하는 반복 구간에서 각 숫자를 한 줄에 출력하세요
		for(int j = 10; j <= 20; j += 3) {
			System.out.printf("%s ", j);
		}
		System.out.println();
		
		// 3) 대문자 A부터 Z까지 한 줄에 출력하세요
		for(char k = 'A'; k <= 'Z'; k++) {
			System.out.printf("%c", k);
		}
		System.out.println();
		
		// 4) 5에서 0까지 1씩 감소하는 값을 한 줄에 출력하세요
		for(int l = 5; l >= 0; l--) {
			System.out.printf("%s ", l);
		}
		
		for(/*번수 선언 및 초기화*/;/*반복조건*/;/*증감식*/) {	// 무한 반복
			System.out.println("infinite loop!!");
		}
		
//		System.out.println(i);
		// {} 안에서 선언한 변수는 해당 블럭 안에서만 유효하다(지역변수)
	}
}
