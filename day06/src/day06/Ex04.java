package day06;

public class Ex04 {
	public static void main(String[] args) {
		
		int length = 5;
		int[][] arr = new int[length][length];
		
		// �̸� ������ ��������ִ�
		
		// ��� �ڵ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int num = 1;
		// ���� �����ϱ� (������� �� �ֱ�)
		for(int i = 0; i < arr.length; i++) { 
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		num = 1;
		// ���� �����ϱ� (snake �������� �� �ֱ�)
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
		
		// ��� �ڵ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
