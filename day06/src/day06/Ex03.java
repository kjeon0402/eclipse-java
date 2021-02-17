package day06;

public class Ex03 {
	public static void main(String[] args) {
				
		// 1) 1~25를 순서대로 출력하기
		int length = 5;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				
				int num = length * i + j + 1;		
				// 반복문 안에서 선언한 변수는 반복횟수마다 소멸과 생성을 반복한다
				
				System.out.printf("%2d ",num);
			}
			System.out.println();
		}
		System.out.println();
		
		// 2) num 변수를 이용하여 아래와 같이 출력하세요
		//  1  2  3  4  5 
		// 10  9  8  7  6 
		// 11 12 13 14 15 
		// 20 19 18 17 16 
		// 21 22 23 24 25
		
		int num = 1;

		for(int i = 0; i < length; i++) {
			
//			if(i % 2 == 0) { 
//				num = length * i + 1;
//			}
//			else {
//				num = length * i + length;				
//			}
			boolean flag = i % 2 == 0;
			num = length * i + (flag ? 1 : length);
			
			for(int j = 0; j < length; j++) {
				System.out.printf("%2d ", flag ? num++ : num--);
			}
			System.out.println();
			
			// 단항연산자이기 때문에 가능한 식
		}
	}
}
