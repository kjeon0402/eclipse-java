package day13;

class Test1 {
	int num;
	Test1() {		
		this(1);	// this.은 멤버 요소를 가리키는 형식, this()는 자신의 행성자를 가리키는 형식
		System.out.println("기본 생성자");
//		this.num = 1;
//		Test1(1);
	}
	Test1(int num) {
		System.out.println("정수를 전달받는 생성자");
		this.num = num;
	}
	void show() {
		System.out.println("num : " + num + "\n");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1();
		ob1.show();
		Test1 ob2 = new Test1(5);
		ob2.show();
	}
}
