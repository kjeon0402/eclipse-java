package day13;



public class Ex02 {
	public static void main(String[] args) {
		Pos ob1 = new Pos();	// 클래스를 데이터를 생성하기 위한 자료형이다
		
		// Pos 형태를 가리킬 수 있는 변수 ob1을 선언하고
		// 그 초기값으로 Pos형태의 데이터를 저장할 수 있는 공간(크기는 자바가 알아서 계산)을 생성한 후
		// 클래스에 명시되어 있는 멤버 필드와 멤버 메서드를 연결한 상태로 객체를 생성하여
		// 해당 객체의 위치주소 값을 ob1에 저장한다
		
		// 메모리 공간 할당과 데이터 생성을 동시에 처리해주는 역할
		// 객체를 생성하면서 추가적인 초기작동을 작성할 수도 있다
		
		// 생성자는 클래스의 이름과 동일한 함수이다
		// 생성자는 반환형을 별도로 가지지 않는다 -> 클래스 형태의 데이터를 반환하는 형태로 고정이므로
		
		Student st1 = new Student();	// 이름과 점수를 전달하지 않으면 Student 객체를 생성할 수 없다 
		st1.name = "이지은";
		st1.score = 100;
		st1.show();
		
		Student st2 = new Student("홍진호", 22);
		st2.show();
	}
}

class Student {
	// 생성자(매개변수를 전달 받아서, 객체의 초기값을 지정할 수 있다)
	Student() {
		System.out.println("기본 생성자 호출!!");
	}
	// 생성자는 함수이므로, 오버로딩(중복정의)이 가능하다(전달하는 매개변수의 자료형이나 개수가 다르면 OK)
	Student(String name, int score) {	// 생성자는 함수이고, 함수에서는 멤버 필드보다 지역변수를 우선 참조한다
		this.name = name;
		this.score = score;		// 지역변수와 구별하여, 멤버 필드(객체의 멤버 요소)를 가리키기 위해 this 사용
		System.out.println("오버로딩 생성자 호출 : 이름과 점수를 전달받았습니다.");
	}
	
	// 멤버 필드
	String name;
	int score;
	
	// 멤버 메서드
	void show() {
		System.out.printf("%s님의 정수는 %d점입니다.\n", name, score);
	}
}