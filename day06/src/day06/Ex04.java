package day06;

public class Ex04 {
	public static void main(String[] args) {
		
		int length = 5;
		int[][] arr = new int[length][length];
		
		// 미리 공간이 만들어져있다
		
		// 출력 코드
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int num = 1;
		// 값을 대입하기 (순서대로 값 넣기)
		for(int i = 0; i < arr.length; i++) { 
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		num = 1;
		// 값을 대입하기 (snake 형식으로 값 넣기)
		for(int i = 0; i < arr.length; i++) { 
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arr[i][j] = num++;
				}
			} else {
				for(int j = 4; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}
		}
		
//		arr[0][3] = 0;
		
		// 출력 코드
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
