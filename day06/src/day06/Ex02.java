package day06;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1) ������ �߿��� 3�ܸ� ����غ��� (for X)
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
		
		// 2) 1�� �ڵ忡 �ݺ����� �����غ���
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", 3, i, 3*i);
		}
		System.out.println();
		
		// 3) 2�ܺ��� 9�ܱ��� ����ϱ� ���ؼ���?
		for(int i = 2; i < 10; i++) {
			// 2�� �ڵ�(������ �߿��� �� ���� ����ϴ� �ڵ�)�� �״�� �ٿ��ֱ�
			// 1���� ���� ����ϴ� �ڵ忡 ���ؼ� 2�ܺ��� 9�ܱ��� �ݺ�
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		// for������ ����ϴ� i��� ������ �̸��� iterable�̶�� �ܾ��� ù���ڸ� ����ϴ� �����̴�
		// index
	}
}
