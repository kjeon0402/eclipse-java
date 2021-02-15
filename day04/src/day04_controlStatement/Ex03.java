package day04_controlStatement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		// 두 정수를 입력받아서 둘 중 큰 수를 화면에 출력하세요
		// 두 전수가 같다면 같은 수가 입력되었습니다.라고 화면에 출력하자
		
		System.out.print("첫 번째 값을 입력하세요 : ");
		n1 = sc.nextInt();
		
		System.out.print("두 번째 값을 입력하세요 : ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {							// 만약 n1이 크다면
			System.out.println(n1);
		} 
		else if(n1 < n2) {						// 첫번째 조건이 true가 아닐 경우, 조건 판별
			System.out.println(n2);
		}
		else {	// if(n1 == n2) {
			System.out.println("같은 수가 입력되었습니다.");
		}
		
		// 여러 선택지를 나열하기 위해서, 연속된 if를 사용할 수도 있고, if ~ else if ~ else 형식도 가능
		// 연속된 if 는 동시에 실행할 수 있는 가능성이 열려 있다
		// if ~ else if ~ else는 제시된 선택지 중에서 반드시 하나만 실행된다
		
		// else는 이전 if가 있어야 작동하며, 이전의 if가 처리하지 못한 모든 결과를 처리한다
		// else는 조건을 별도로 명시하지 않는다
		
		sc.close();
	}
}
