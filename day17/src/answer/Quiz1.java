package answer;

class Human {
	// 이름을 전달받는 생성자
	private String name;	// private : 클래스 내부를 제외하고는 접근을 허용하지 않는다
//	protected String name;	// protected : 상속 관계에서 접근을 허용한다(패키지 포함)
	
	public Human(String name) {
		this.name = name;
	}
	// 자신의 이름을 출력하는 show() 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Doctor extends Human {
	public Doctor(String name) {
		super(name);
	}
	// 응급처치 고유 메서드
	public void cure() {
		System.out.println(getName() + " : 응급 처치 진행중입니다!!");
	}
}

class Student extends Human {
	public Student(String name) {
		super(name);
	}
}

class Singer extends Human {
	public Singer(String name) {
		super(name);
	}
}

class Air {
	private Human[] seat = new Human[4];
	// Human을 매개변수로 받아서 seat의 빈 칸에 넣어주는 메서드 enter(Human human)
	public void enter(Human human) {	// 메서드를 호출하면서 전달되는 인자가 up-casting되어 매개변수에 들어온다
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] == null) {
				seat[i] = human;
				System.out.println(human.getName() + " : 탑승 완료!!");
				return;
			}
		}
		System.out.println(human.getName() + " : 자리가 없는데 어떻게 타요??");
	}
	
	public void emergency() {
		for(Human h : seat) {
			if(h instanceof Doctor) {
				((Doctor)h).cure();	// down-casting
			}
		}
		System.out.println("의사를 찾을 수 없습니다.");
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Doctor c1 = new Doctor("메르시");
		Student c2 = new Student("철수");
		Singer c3 = new Singer("아이유");
		Human c4 = new Human("홍길동");
		Human c5 = new Human("조세호");
		
		Air plane = new Air();
		plane.enter(c1);	// 이름 : 탑승 완료!!
		plane.enter(c2);
		plane.enter(c3);
		plane.enter(c4);
		plane.enter(c5);	// 조세호 : 자리가 없는데 어떻게 타요??
		
		plane.emergency(); 	// 승객 중에서 자료형이 Doctor인 객체를 찾아서
							// 이름을 말하게 하고, 응급처치중이라는 메시지를 출력한다
							// 메시지를 출력하는 주체가 Doctor의 인스턴스가 되도록 한다
							// Doctor 클래스의 메서드를 호출해야 한다(고유 기능)
	}
}
