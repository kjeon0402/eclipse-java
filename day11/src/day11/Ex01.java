package day11;

public class Ex01 {
	public static void main(String[] args) {
		// 2차원 배열, 배열 안에 배열
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] arr3 = { 11 };
		int[] arr4 = { 16, 17, 18, 19, 20 };
		int[] arr5 = { 21, 22, 23, 24, 25 };
		
		int[][] arr = { arr1, arr2, arr3, arr4, arr5 };
		
		for(int i = 0; i < arr.length; i++) {	// 전체 배열에서 멤버 요소를 하나씩 꺼내면
			// 그 각각은 정수형 배열이다
			int[] a = arr[i];
			
			for(int j = 0; j < a.length; j++) {	// 내부 배열마다 길이가 다를 수 있다
				System.out.printf("%2d ", a[j]);
			}
			System.out.println();
		}
		
		int[][] test = new int[5][5];
		
		int[][] test2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		// 값과 길이를 모두 명시하지 않는다
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.printf("%2d ", test[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
