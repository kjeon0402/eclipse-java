package stdout;

public class Ex01 {
	public static void main(String[] args) {
		
		System.out.print("A");		// () 안에 들어간 값을 출력, 줄바꿈 없음
		System.out.println("B");	// () 안에 들어간 값을 출력, 출력이 끝나면 한 줄 내림
		System.out.printf("C");		// () 안에 서식을 작성하고, 서식에 맞는 값을 순서대로 출력, 줄바꿈 없음
		
		// System.in : 외부에서 내 컴퓨터로 들어오는 통로		(사용자의 입력을 받고 싶을 때)
		// System.out : 내 컴퓨터에서 외부로 빠져나가는 통로		(사용자에게 값을 출력하고 싶을 때)
		
		String name = "이지은";
		int age = 29;
		
		System.out.println();  		// 값 없이 System.out.println()을 실행하면 한 줄 바꿈
		
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.printf("나이 : %d", age);
	}
}
