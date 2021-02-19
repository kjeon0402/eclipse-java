package function;

public class Ex04 {
	// 함수 정의는 이곳에
	static boolean isEven(int num) {
//		return num % 2 == 0;
		if(num % 2 == 0) {
			 return true;
		} else {
			return false;
		}
	}
	
	static int getBigNumber(int num1, int num2) {	// 매개변수에 자료형을 적는다는 것은 
													// 지역변수를 선언하는 것과 동일한 작업이기 때문이다
													// 단, 매개변수는 인자값을 전달받기 때문에
													// 초기화가 필요없다
		
		// 자바의 함수는 반환형에 해당하는 값을 무조건 반환해야 한다는 규칙이 존재
		if(num1 > num2) { 
			return num1;
		} else {
			return num2;
		}
	}
	
	static String getProfile(String name, int age) {
		String str = String.format("%s님은 %d살입니다.\n", name, age);
		return str;
	}
	
	public static void main(String[] args) {
		// 함수 만들기(정의하기) 연습
		
		// sample) 정수를 하나 전달받아서, 정수가 짝수이면 true, 홀수이면 false를 반환하는 함수를 정의하세요
		boolean flag1 = isEven(3);
		boolean flag2 = isEven(4);
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		// 1) 두 개의 정수를 전달 받아서, 둘 중 큰 수를 반환하는 getBigNumber를 작성하세요
		int big = getBigNumber(5, 3);
		System.out.println(big);
		
		// 2) 이름과 나이를 문자열, 정수 형태로 전달 받아서 "ooo님은 xx살입니다" 형태의 문자열을 반환하는 함수
		// getProfile()을 작성하세요
		// System.out.printf("%s", name);			서식 문자열을 화면에 출력하는 용도
		// String str = String.format("%s", name);	서식 문자열의 값을 만들어서 저장하거나 반환하는 용도
		
		String profile = getProfile("이지은", 29);
		System.out.println(profile);
		
		// 3) day04 프로젝트의 Quiz3의 내용을 참조하여
		// 이용시간을 전달받아서, 지불할 금액을 반환하는 함수 getFee(int time)을 작성하세요
		int time = 40;
		System.out.printf("%d시간 이용금액은 %,d원입니다\n", time, getFee(time));
			
	}
	
	static int getFee(int time) {
		int fee = 0;
		if(time > 0 && time <= 30) {
			fee = 3000;
		} else {
			if(time % 10 == 0) {
				fee = 3000 + ((time - 30) / 10) * 500;
			} else {
				fee = 3000 + (((time - 30) / 10) + 1) * 500;
			}
		}
		return fee;
	}
	
}
