package day06;

public class Ex05 {
	public static void main(String[] args) {
		
		// ���� �׸���
		
		String ch = "#";
		
		// �⺻����
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				System.out.printf("%s ", ch);
			}
			System.out.println();
		}
		System.out.println();
		
		// �簢��
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
		
		// X ��� �׸���
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				
				boolean flag = i == j || i + j == 4;
				System.out.printf("%s ", flag ? ch : " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
