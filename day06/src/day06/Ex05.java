package day06;

public class Ex05 {
	public static void main(String[] args) {
		
		// 도형 그리기
		
		String ch = "#";
		
		// 기본형태
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				System.out.printf("%s ", ch);
			}
			System.out.println();
		}
		System.out.println();
		
		// 사각형
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				
				if(i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.printf("%s ", ch);
				} else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		System.out.println();
		
		// X 모양 그리기
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				
				boolean flag = i == j || i + j == 4;
				System.out.printf("%s ", flag ? ch : " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 직각삼각형 그리기
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				
				boolean flag2 = i >= j;
				System.out.printf("%s ", flag2 ? ch : " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 직각삼각형2(반복 횟수 줄이기)
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				System.out.printf("%s ", ch);
				if(i == j) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 직각삼각형3
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j <= i; j++) {
				System.out.printf("%s ", ch);
			}
			System.out.println();
		}
		System.out.println();
	}
}
