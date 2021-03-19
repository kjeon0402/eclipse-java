package abstractClass;	// 추상클래스

abstract class Love {	// The type Love must be an abstract class to define abstract methods
	abstract void showLove();	// This method requires a body instead of a semicolon : body가 필요하다
	
	String name = "사랑";
	
	void sayLove() {
		System.out.println("I love you!!");
	}
}

class LovelyCat extends Love {

	@Override			// 상속받은 메서드의 내용을 재정의하는 기능(내용이 없었는데, 새로 작성할 수 있다)
	void showLove() {	// 내용은 정해지지 않았지만, 형태가 고정인 메서드를 반드시 구현해야 한다
		System.err.println("♥");
	}	
	// The type LovelyCat must implement the inherited abstract method Love.showLove()
	// 자료형 LovelyCat은 상속받은 추상 메서드 showLove()를 구현해야 합니다(오버라이딩하세요)
}

public class Ex01 {
	public static void main(String[] args) {
//		Love ob = new Love();	// Cannot instantiate the type Love
								// 자료형 Love를 인스턴스화(객체화)할 수 없습니다
		LovelyCat cat = new LovelyCat();
		cat.showLove();
		cat.sayLove();
	}
//	abstract
//	추상 클래스 : 추상 메서드를 포함할 수 있는 클래스, 추상클래스는 직접 객체를 생성할 수 없다
//	추상 메서드 : 형식은 정의되어 있으나, 몸체(body)가 구현되지 않아서 호출할 수 없는 형태의 메서드
	
//	이벤트 처리 -> 버튼에 마우스를 클릭하면 어떤 동작(작성내용은 사람마다 다르다)이 발생한다
//	onclick
}
