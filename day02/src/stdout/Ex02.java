package stdout;

public class Ex02 {
	public static void main(String[] args) {
		
		// 기본 출력 함수는 기본 자료형의 데이터와 문자열을 출력할 수 있다
		
		System.out.println("이지은");
		System.out.println(true);
		System.out.println(-100);
		System.out.println(3.14);
		System.out.println(999999999L);
		
		// 여러 값을 한 줄에 출력하고 싶다면
		System.out.println("이름 : " + "이지은" + ", " + "나이 : " + 29);
		// 정수로 계산하지 않고, 문자열을 이어붙이기 하여 하나의 값을 만들어서 출력한다
		
//		System.out.println("이름 : ", "이지은", "나이 : ", 29);
		System.out.printf("%s : %s, %s : %d", "이름", "이지은", "나이", 29);
	}
}
