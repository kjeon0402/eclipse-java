package Inheritance;

class Member { // 사이트 회원
	String userid;

	Member(String userid) {
		this.userid = userid;
	}

	void show() {
		System.out.println("ID : " + userid);
	}
}

class Customer extends Member { // 주로 구매를 하는 고객 회원
	Customer(String userid) {
		super(userid);
	}

	void show() { // 슈퍼클래스에 없는 메서드, 고유기능
		System.out.println("[구매고객] ID : " + userid);
	}
}

// 메서드 오버로딩(Method Overloading) : 상속이랑 관련 없고, 하나의 함수 이름으로 여러 개의 정의를 만들어내는 작업(중복 정의)
// 메서드 오버라이딩(Method Overriding) : 상속 받은 메서드의 형식을 그대로 유지하면서 내용을 새로 정의하는 작업(재정의)
class Seller extends Member { // 주로 판매를 하는 회원
	Seller(String userid) {
		super(userid);
	}

	@Override // 오버라이딩 규칙에 어긋나면 경고를 표시(Annotation)
	void show() { // 슈퍼클래스에서 이미 정의된 메서드, 상속받은 기능, 덮어쓰기
		System.out.println("[판매고객] ID : " + userid);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Member m1 = new Member("member");
		Customer ob1 = new Customer("test1");
		Seller ob2 = new Seller("itbank");	// 참조변수 말고, 객체의 자료형은 생성자로 결정

		m1.show();
		ob1.show();
		ob2.show();

		// 학생은 사람이다
		// 판매고객은 멤버이다
		// 구매고객은 멤버이다

		Member m2 = ob1;	// 서브클래스의 객체를 슈퍼클래스로 쓸 수 있다
		Member m3 = ob2;
		System.out.println("=========================");
		Member[] arr = { m1, m2, m3 };
		
		for(Member m : arr) {
			m.show();	// 오버라이딩된 메서드는 서브클래스의 내용을 그대로 수행한다
		}
	}
}
