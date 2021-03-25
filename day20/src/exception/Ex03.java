package exception;

import java.util.Scanner;

// 내가 정의하는 예외

class ScoreValueOutOfBoundException extends Exception {
	@Override
	public String toString() {
		return this.getClass().toString().split(" ")[1];
	}

	@Override
	public String getMessage() {
		return "점수가 범위를 벗어났습니다.";
	}	
}

public class Ex03 {
	public static void main(String[] args) throws Exception {
		// 지정한 메서드에서 예외가 발생하면 직접 처리하지 않고 메서드를 호출한 caller에게 예외를 전가시킨다
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		try {
			System.out.print("점수 입력 (0 ~ 100) : ");
			score = sc.nextInt();
			if(0 > score || score > 100) {
				throw new ScoreValueOutOfBoundException();
				// throw : 내가 정의하는 예외 객체를 던진다. 던져진 예외는 catch에서 받을 수 있다
			}
			
			System.out.printf("점수는 %d점입니다.\n", score);
			
		} catch(ScoreValueOutOfBoundException e) {
//			System.out.println("점수가 범위를 벗어났습니다!!");
//			e.printStackTrace();
			System.err.println(e + " : " + e.getMessage());
//			System.out.println(e);
		}
		
		sc.close();
	}
}
