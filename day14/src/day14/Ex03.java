package day14;

class Student {
	private String name;	// 의도치 않은 값의 변경을 막기 위해, private로 설정한다
	private int score;
	
	public void setName(String name) {	// setter : 멤버필드에 대한 대입을 처리해주는 메서드
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {			// getter : 멤버필드의 값을 외부로 전달하는 메서드
		return name;
	}
	public int getScore() {
		return score;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Student st1 = new Student();
		
//		st1.name = "이수현";	// private으로 설정된 필드에는 값을 대입하거나 출력할 수 없다.
//		st1.score = 94;
//		
//		System.out.printf("%s의 점수는 %d점입니다.\n", st1.name, st1.score);
		
		st1.setName("이수현");
		st1.setScore(99);
		System.out.printf("%s의 점수는 %d점입니다.\n", st1.getName(), st1.getScore());
	}
}
