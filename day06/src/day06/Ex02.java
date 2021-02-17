package day06;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1) 구구단 중에서 3단만 출력해보자 (for X)
		System.out.printf("%d * %d = %d\n", 3, 1, 3*1);
		System.out.printf("%d * %d = %d\n", 3, 2, 3*2);
		System.out.printf("%d * %d = %d\n", 3, 3, 3*3);
		System.out.printf("%d * %d = %d\n", 3, 4, 3*4);
		System.out.printf("%d * %d = %d\n", 3, 5, 3*5);
		System.out.printf("%d * %d = %d\n", 3, 6, 3*6);
		System.out.printf("%d * %d = %d\n", 3, 7, 3*7);
		System.out.printf("%d * %d = %d\n", 3, 8, 3*8);
		System.out.printf("%d * %d = %d\n", 3, 9, 3*9);
		System.out.println();
		
		// 2) 1번 코드에 반복문을 적용해보자
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", 3, i, 3*i);
		}
		System.out.println();
		
		// 3) 2단부터 9단까지 출력하기 위해서는?
		for(int i = 2; i < 10; i++) {
			// 2번 코드(구구단 중에서 한 단을 출력하는 코드)를 그대로 붙여넣기
			// 1개의 단을 출력하는 코드에 대해서 2단부터 9단까지 반복
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		// for문에서 사용하는 i라는 변수의 이름은 iterable이라는 단어의 첫글자를 사용하는 관례이다
		// index
	}
}
