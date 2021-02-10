package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 사용자에게 글자를 하나 입력받아서, 해당 글자가 산술연산자 (+,-,*,/,%)에 해당하면
		// 연산자입니다. 라고 출력하고
		// 연산자가 아니면, 연산자가 아닙니다. 라고 출력하세요
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("글자를 하나 입력하세요 : ");
		ch = sc.next().charAt(0);	// 문자열을 입력받고, 그 중에서 0번째에 위치하는 글자를 하나 가져온다
		
		ch = ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' ? 'O' : 'X';
		
		System.out.print(ch == 'O' ? "연산자입니다." : "연산자가 아닙니다.");
		
		sc.close();
	}
}
