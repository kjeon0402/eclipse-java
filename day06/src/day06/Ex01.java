package day06;

public class Ex01 {
	public static void main(String[] args) {
		
		// for문 내부에 또다른 for문을 작성하여 사용하는 예시

		// 1) 표의 형태를 만들고 싶을 때 (가로 세로가 필요할 때)
		// 2) 큰 반복 내에 작은 반복이 필요할 때 (구구단)
		// 3) 2차원 배열을 제어할 때

		int num = 0;
		for(int i = 0; i < 5; i++) { // 바깥쪽 for문은 총 5회 수행 => 5줄을 출력한다
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", ++num); // 한 줄 안에는 총 5개의 숫자가 출력된다
			}
			System.out.println(); // 안쪽 for문이 종료되면 한 줄이 바뀐다
		}
		System.out.println();


		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("(%d,%d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();

		// 바로 위에 있는 반복문에서 i와 j의 규칙을 파악하고
		// num을 사용하지 않고, i와 j만을 사용하여 1~25의 정수를 5줄 5칸으로 출력하세요

		for(int i = 0; i < 25; i += 5) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", j+i+1);
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i < 5; i++) {
			for(int j= 0; j < 5; j++) {
				System.out.printf("# ");
			}
			System.out.println();
		}
		System.out.println();

		// 위 코드를 참조하여, if 혹은 삼항연산을 활용하여 테두리에만 #을 출력하고
		// 안쪽칸에는 공백문자를 출력하도록 사각형을 그려보세요

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 0 || i == 4) {
					System.out.printf("# ");
				}else if(j == 0 || j == 4) {
					System.out.printf("# ");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 시간 복잠도 : 코드를 수행하는데 평균 시간이 얼마나 걸리는가? O(n), O(n^2)...
		// 공간 복잡도 : 코드를 수행하는데 메모리 공간이 평균적으로 얼마나 소모되는가?
		// 가독성 : 코드를 읽기 수월하게 작성하였는가?
		
		// 최근의 컴퓨터는 공간 복잡도에 민감하지 않아도 될 정도로, 메모리나 디스크의 용량이 충분하기 때문에
		// 공간을 더 사용하더라도, 시간을 줄이거나, 가독성이 높아진다면 코드를 변경하는 편이 많다
	}
}