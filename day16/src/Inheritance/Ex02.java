package Inheritance;

// 상속을 처리할 클래스는 분류상으로 상위/하위로 구분될 수 있어야 한다
// 슈퍼클래스를 A라고 하고, 서브클래스를 B라고 하면
// B는 A이다라는 말이 성립 가능해야 한다
// 학생은 사람이다(O)
// 타이어는 자동차다(?)

class Human {
	String name;
	int age;
//	public Human() {
//		System.out.println("Human 기본 생성자 호출!!");
//	}
	public Human(String name, int age) {	// 클래스에서 생성자를 작성하면 JVM이 기본생성자를 만들지 않는다
		this.name = name;
		this.age = age;
		System.out.println("Human의 이름과 나이를 전달 받는 생성자 호출!!");
	}
	public void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
}

class Student extends Human {	// 상속의 경우, 서브클래스의 생성자가 슈퍼클래스의 생성자를 호출해야 한다
	int score;
//	public Student() { super(); }
	public Student(String name, int age, int score) {
		super(name, age);	// this()와 마찬가지로 첫 줄에서 호출한다(슈퍼클래스의 값은 슈퍼클래스에게 넘긴다)
		this.score = score;	// 서브클래스의 값은 직접 처리한다
		
//		super();
//		super.name = name;	// this과 supper 모두 가능
//		super.age = age;	// 상속 받은거니까 super 가능, 물려받아서 내가 가지고 있으니 this도 가능
//		this.score = score;	// 이건 상속 받은 것이 아니니까 super는 안됨
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student st1 = new Student("이지은", 29, 99);
//		st1.name = "이지은";	// st1 객체는 Human으로부터 String name, int age를 받아서 가지게 된다
//		st1.age = 29;
//		st1.score = 99;		// score는 Student 클래스에서 정의된 멤버 필드이다
		st1.show();
		
		Human h1 = st1;	// Student 객체 st1은 Human타입으로 참조할 수 있다
		Human h2 = new Student("홍진호", 40, 22);
//		Student st2 = new Human("홍길동", 20);
		// 모든 사람이 학생은 아니다
		
		// 서브클래스의 객체를 슈퍼클래스의 참조변수로 참조할 수 있다
		// 하나의 객체는 반드시 하나의 자료형으로만 참조하지 않고, 상속관계에 있는 다른 자료형으로도 참조될 수 있다
		// 하나의 객체는 상황에 따라 다양한 형태로 참조될 수 있다 -> Polymorphism(다형성)
		
		// 원종래 in 학원		(수업) 
		// 원종래 in 친구들		(잡담, 놀기)
		// 원종래 in 집			(가족구성원으로써의 역할)
		// 원종래 in 미용실		(고객)
	}
}
