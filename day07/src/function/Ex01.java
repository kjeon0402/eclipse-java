package function;

public class Ex01 {
	public static void main(String[] args) {
		// 함수 : 입력값을 전달받아서, 일정한 코드를 수행하고, 출력값을 반환하는 코드
		
		// 자주 사용되는 코드를 묶어놓은 집합이다
		// 일반적인 함수는 입력값과 출력값을 가진다
		// y = f(x)
		// function => 기능 => 프로그램이 자주 수행하는 기능을 명시하는 코드
		// 자판기에 돈을 넣고 버튼을 누르면 음료수가 나온다
		// 음료수 = 자판기 버튼(돈, 버튼 선택)
		
		// 특정 경우에는 입력값이 필요없거나, 출력값이 없는 함수도 존재한다
		
		System.out.println("Hello, World!!");
		System.out.println();
		
		// 변수에 값을 저장해서 출력 : 변수는 담겨있는 값을 재사용하기 위해서 사용한다
		String str1 = "Hello, World!!";
		System.out.println(str1);
		System.out.println();
		
		// 자주 사용되는 코드가 있다면 함수로 묶어서 사용할 수 있다
		// 규칭성과 연속성을 만족한다면, 반복문으로 처리할 수 있다
		for(int i = 0; i < 5; i++) {
			System.out.println(str1);
		}
		System.out.println();
		
		hello();
		System.out.println("It's so cold!");
		hello();
		System.out.println("지금은 함수에 대해서 공부하고 있습니다");
		hello();
		hello();
		System.out.println("==================");
		for(int i = 0; i < 5; i++) {
			hello();
		}
		
	}	// end of main
	
	// 함수는 이름 뒤에 ()가 붙어서 나온다, () 안에 값이 있을 수도, 없을 수도 있다.
	static void hello() {
		System.out.println("Hello!!");
	}
	
}	// end of class
