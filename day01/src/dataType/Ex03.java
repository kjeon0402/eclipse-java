package dataType;

public class Ex03 {
	public static void main(String[] args) {
		
		// 컴퓨터 내에서 존재하는 모든 데이터는 자료형이 필요하다
		// 대입 연산자(=)를 기준으로 좌변과 우변은 자료형이 같아야 한다
		
		// 변수 : 변할 수 있는 값, 데이터를 저장해 두었다가 다시 불러와서 사용하기 위함
		// 상수 : 항상 같은 값, 데이터를 한번 생성하면 그 값을 변경할 수 없음
		// 함수 : 입력값에 따라서 다른 출력값을 나타내는 수식 or 코드, y = f(x)
		// 리터럴 상수 : 프로그램이 시작할 때 미리 준비된 값
		
		String name = "이지은";
		int age = 29;
//		int num = "이지은";
		
		// String : 클래스 자료형, 변수는 참조변수가 된다(임시주소를 담아서 값을 참조한다)
		// name : 변수
		// "이지은" : 리터럴 상수, 리터럴이라고 줄여서 말하며, 실행 전 미리 별도의 공간에 데이터를 준비하고 실행
		// int : 기본 자료형, 변수는 일반 변수가 된다(값을 직접 저장한다)
		// age : 변수
		// 29 : 리터럴이라고 볼수 있으나, 정수는 프로그램에서 가장 기본이므로, 생성하지 않아도 즉시 만들 수 있다
		// 29라는 값 역시 데이터이며, 데이터는 자료형을 가져야하는데, 별도로 명시하지 않으면 int 가 된다
		
		System.out.println(name + "님의 나이는 " + age + "살입니다");
		
		int n1;			// 변수 선언
		final int n2;	// 변수의 상수화(값을 변경할 수 없다, 초기화는 가능)
		final double pi = 3.14;	// 원주율은 바꾸면 안되는 값이다 !!
		
		n1 = 10;
		n2 = 20;
		
		System.out.println(n1 + ", " + n2);
		
		n1 = 30;
//		n2 = 40;	// The final local variable n2 may already have been assigned
		
		System.out.println(n1 + ", " + n2);
		
		
	}
}
