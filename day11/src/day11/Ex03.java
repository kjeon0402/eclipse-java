package day11;

public class Ex03 {
	public static void main(String[] args) {
		// 가로 세로 5의 2차원 int 배열을 생성하고 순서대로 1~25를 대입하여 출력하세요
		// 비어 있는 배열부터 생성한 이후에 for문으로 값을 대입하세요
		
		int[][] arr = new int[5][5];
		int num = 0;
//		int num1 = 1;
		
		for(int i = 0; i < arr.length; i++) {			// 세로(행)
			for(int j = 0; j < arr[i].length; j++) {	// 가로(열)
				if(i % 2 == 0)
					arr[j][i] = ++num;					// j(열)를 채우면서 1씩 커진다 / 1부터 25까지 순서대로 대입하기
				else
					arr[4 - j][i] = ++num;
//				arr[i][j] = i;
//				arr[i][j] = j;
//				arr[i][j] = i + j + 1;
//				arr[i][j] = (i + j) % 2;
//				arr[0][0] = 1;
//				arr[0][4] = 1;
//				arr[4][0] = 1;
//				arr[4][4] = 1;
			}											// 다 채워지면 i(행)가 바뀌어 계속 진행(1씩 커진다)된다
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", num1);
//				num1++;
//			}
//			System.out.println();
//		}
	}
}
