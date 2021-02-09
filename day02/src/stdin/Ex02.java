package stdin;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 여전히 System.in을 이용하여 생성되는 입력 객체
		// 그러나, 기본적인 예외처리는 자체적으로 내장하고 있으며
		// 특수한 경우를 제외하고는, 기본 자료형과 문자열을 입력받을 수 있는 기능을 지원
		
		String name;
		int age;
		String address;
		
		System.out.print("이름을 입력 : ");
		name = sc.nextLine();		// br.readLine();
		
		System.out.print("나이를 입력 : ");
		age = sc.nextInt();			// 정수를 입력받는 기능 (정수만 가져온다=이스케이프시퀀스는 처리하지 않는다)
		sc.nextLine();				// 버퍼에 남아있는 엔터 값을 제거하면 주소 입력 가능
		
		System.out.print("주소를 입력 : ");
		address = sc.nextLine();	// 남아 있는 \r, \n 이전의 문자열을 가져온다
		
		System.out.printf("%s님은 %d살이고, %s에 살고 있습니다.\n", name, age, address);
		
		sc.close();		// 열려 있는 입력 통로를 닫자 (사용이 끝났으면 닫아야 한다)
	}
}
