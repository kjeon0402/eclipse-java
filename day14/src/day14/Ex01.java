package day14;

class Kid {
	String name;	// 멤버 필드
	Ball b;			// 멤버 필드에 다른 클래스 형태의 참조변수를 작성할 수 있다(초기값 null : 대상이 없다)
	
	Kid(String name) {	// 생성자
		this.name = name;
	}
	void takeBall(Ball b) {	// 메서드 : 매개변수에서도 다른 클래스의 참조변수를 선언해서 받을 수 있다
		this.b = b;
		System.out.println(name + "가 공을 가지고 있다!!\n");
	}
	void throwBall(Kid other) {	// 메서드 : 자신과 같은 타입의 다른 객체를 참조하는 것도 가능하다
		System.out.println(name + "가 " + other.name + "에게 공을 던졌다.");
		other.takeBall(b);
		this.b = null;	// 대입은 값이 복사되므로, 넘겨줬다라는 개념을 구현하기 위해서 자신의 필드에 null을 대입
	}	
}

class Ball {
	
}	// 생성자를 작성하지 않으면, JVM이 기본 생성자를 만들어준다

public class Ex01 {
	public static void main(String[] args) {
		Kid minho = new Kid("민호");
		Kid chanhyuk = new Kid("찬혁이");
		Ball b = new Ball();
		
		minho.takeBall(b);
		minho.throwBall(chanhyuk);
		chanhyuk.throwBall(minho);
	}
}
