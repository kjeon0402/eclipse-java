package day06;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("ù��° ������ �Է� : ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է� : ");
		n2 = sc.nextInt();
		
		// �Է¹��� �� ���� ������ ���� ���Ͽ� ����ϼ���
		// n1�� n2�� ��Ұ���� ������ ���� �ʽ��ϴ�
		// 3�� 5�� �Է��ϸ� 3 + 4 + 5 = 12
		// 3�� 3�� �Է��ϸ� 3
		// 5�� 3�� �Է��ϸ� 3 + 4 + 5 = 12
		// �Է¹޴� ������ ������ -10,000,000���� 10,000,000
		
		sc.close();
	}
}
