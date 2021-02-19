package day07;

public class Ex01 {
	public static void main(String[] args) {
		
		// 2중 for문으로 도형 만들기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 좌측 하단이 직각인 이등변삼각형
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = i >= j;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 우측 하단이 직각인 이등변 삼각형
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = i + j >= 4;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + j >= 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 우측 하단이 직각인 이등변 사각형(공백과 도형의 개수를 조절하면서 출력하기
		int space = 4, star = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < space; j++) {	// 정해진 개수만큼 공백 출력
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {		// 정채진 개수만큼 별을 ㅊ풀력
				System.out.print("* ");
			}
			space--;	// 공백은 1씩 감소하고
			star++;		// 별은 1씩 증가한다
			System.out.println();
		}
		System.out.println();
	}
}
