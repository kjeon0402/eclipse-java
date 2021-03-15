package day13;

class Pos {	// 사용자 정의 자료형(실제 데이터가 아니고, 앞으로 작성할 데이터의 형태만 정의하고 있음)
	int x;
	int y;
	
	// 어차피 Pos만 처리하는 함수이므로, 자료형 내부에 넣어두면 객체가 메서드를 호출하여 실행할 수 있다
	String getPosition() {
		String position = String.format("(%d, %d)", x, y);
		return position;
	}
	
	// int x, int y와 같이 클래스 내부에서 값을 저장하는 변수 -> 멤버 필드, 멤버 변수
	// 클래스 내부에 정의된 함수 -> 멤버 메서드(함수)
	
	// 멤버 필드는 속성, 값, 명사(Noun) 형태를 저장한다
	// 멤버 메서드는 동작, 행위, 기능, 동사(Verb) 형태를 나타낸다
	// 객체를 나타내기 위해서 미리 정의하는 자료형이 Class
	// Class에 의해 만들어진 개별 데이터를 객체(Object, Instance)
}

public class Ex01 {
	
	// 특정 자료형에만 대응되는 함수
	static String getPosition(Pos arg) {
		String position = String.format("(%d, %d)", arg.x, arg.y);
		return position;
	}
	
	public static void main(String[] args) {
		Pos ob1 = new Pos();	// 사용자 정의 자료형으로 만들어낸 데이터
		ob1.x = 2;				// 내부 속성값을 할당
		ob1.y = 3;
		// 속성에 대한 정보를 출력하는 코드
		System.out.printf("ob1의 위치는 (%d, %d)입니다.\n", ob1.x, ob1.y);
		
		Pos ob2 = new Pos();
		ob2.x = 10;
		ob2.y = 20;
		System.out.printf("ob2의 위치는 %s입니다.\n", getPosition(ob2));
		// 함수가 별도로 정의되었을 경우에는, 객체를 전달하면서 함수를 호출했었지만
		
		Pos ob3 = new Pos();
		ob3.x = 11;
		ob3.y = 22;
		System.out.println("ob3의 위치는 " + ob3.getPosition() + "입니다.");
		// 함수를 클래스 내부에 포함시킨 이후에는, 객체.함수이름()으로 호출하면 인자를 전달하지 않아도 된다
	}
}
