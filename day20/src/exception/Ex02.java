package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		try {	// 예외 발생 가능성이 존재하는 코드를 작성하는 영역
			
			System.out.print("정수 입력 : ");
			num = sc.nextInt();		// 정수가 아닌 값을 입력하면 InputMismatchException이 발생한다
									// 자바에서는 예외도 객체로 취급한다(객체가 발생할 수 있다는 것은 클래ㅔ스가 존재한다는 의미)
			System.out.println("입력한 정수는 " + num);
			
		} catch(InputMismatchException e) {	// 지정한 예외가 발생하면 수횅되는 코드를 작성한다
			System.out.println("정수가 아닌 형태를 입력했습니다.");
//			e.printStackTrace();			// 예외가 발생한 경로를 스택의 형식으로 추적하여 알려주는 메서드
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("예외 형태 : " + e);
			
		} catch(Exception e) {	// 자바에서 발생하는 모든 예외에 대한 슈퍼클래스
			System.out.println("기타 다른 예외가 발생했습니다 : " + e);
			
		} finally {		// 예외발생 여부에 상관없이 항상 수행하는 코드
			System.out.println("프로그램 종료");
			sc.close();	// 스트림 close() 혹은 socket close()
		}
	}
}
