package summary;

public class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	public void give(Mate a) {
		String feed = "먹이";
		
		if(a instanceof Cat) 	feed = "츄르"; 
		if(a instanceof Dog) 	feed = "육포";
		if(a instanceof Friend) feed = "커피";
		
		give(a, feed);
	}
	
	// 인터페이스도 매개변수의 자료형이 될 수 있다
	public void give(Mate a, String feed) {
		String how = "어떻게";
		if(a instanceof Animal) how = "던져";
		if(a instanceof Human) 	how = "건네";
		// 가장 아래 단계의 클래스만 instanceof를 쓰는 건 아니다(슈퍼클래스도 instanceof를 쓸 수 있다)
		
		String format = "%s이 %s에게 %s를 %s 주었다.";
		format = String.format(format, this.name, a.getName(), feed, how);
		System.out.println(format);
		// 대상이 Animal이면 feed를 던져 주었다
		// 대상이 Human이면 feed를 건네 주었다
	}
	// 오버로딩
//	public void give(Cat cat) {
//		String format = "%s가 %s에게 먹이를 주었다.";
//		format = String.format(format, this.name, cat.getName());
//		System.out.println(format);
		
		// Cat과 Dog에 대해 별도로 처리하던 오버로딩(중복 선언)
//	}
	
//	public void give(Dog dog) {
//		String format = "%s가 %s에게 먹이를 주었다.";
//		format = String.format(format, this.name, dog.getName());
//		System.out.println(format);
		
		// 공통점을 Animal에 작성했기 때문에 Animal 클래스 하나로 처리 가능
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 클래스는 자료형의 역할을 한다
	// 필드 생성자 메서드를 통해서 어떻게 작동할지
	// 객체 자신을 나타내는 키워드가 this.다
}
