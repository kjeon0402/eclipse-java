package day06;

public class Ex01 {
	public static void main(String[] args) {
		
		// for�� ���ο� �Ǵٸ� for���� �ۼ��Ͽ� ����ϴ� ����

		// 1) ǥ�� ���¸� ����� ���� �� (���� ���ΰ� �ʿ��� ��)
		// 2) ū �ݺ� ���� ���� �ݺ��� �ʿ��� �� (������)
		// 3) 2���� �迭�� ������ ��

		int num = 0;
		for(int i = 0; i < 5; i++) { // �ٱ��� for���� �� 5ȸ ���� => 5���� ����Ѵ�
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d ", ++num); // �� �� �ȿ��� �� 5���� ���ڰ� ��µȴ�
			}
			System.out.println(); // ���� for���� ����Ǹ� �� ���� �ٲ��
		}
		System.out.println();


		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("(%d,%d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();

		// �ٷ� ���� �ִ� �ݺ������� i�� j�� ��Ģ�� �ľ��ϰ�
		// num�� ������� �ʰ�, i�� j���� ����Ͽ� 1~25�� ������ 5�� 5ĭ���� ����ϼ���

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

		// �� �ڵ带 �����Ͽ�, if Ȥ�� ���׿����� Ȱ���Ͽ� �׵θ����� #�� ����ϰ�
		// ����ĭ���� ���鹮�ڸ� ����ϵ��� �簢���� �׷�������

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
		
		// �ð� ���ᵵ : �ڵ带 �����ϴµ� ��� �ð��� �󸶳� �ɸ��°�? O(n), O(n^2)...
		// ���� ���⵵ : �ڵ带 �����ϴµ� �޸� ������ ��������� �󸶳� �Ҹ�Ǵ°�?
		// ������ : �ڵ带 �б� �����ϰ� �ۼ��Ͽ��°�?
		
		// �ֱ��� ��ǻ�ʹ� ���� ���⵵�� �ΰ����� �ʾƵ� �� ������, �޸𸮳� ��ũ�� �뷮�� ����ϱ� ������
		// ������ �� ����ϴ���, �ð��� ���̰ų�, �������� �������ٸ� �ڵ带 �����ϴ� ���� ����
	}
}