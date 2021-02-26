package recursive;

public class Ex01 {
	
	static void rec1() {	// rec1을 호출하면
		System.out.println("recursive!!");
		rec1();	// 다시 rec1을 호춣한다
	}
	
	public static void main(String[] args) {
		// 재귀함수 : 다시 올아오는 함수
		// A함수가 호출되면 실행되는 코드 중에 다시 A함수를 호출하는 내용을 포함하는 함수
		// 단순하게 작성하면 무한반복이 되고, stack overflow를 발생시킬 수 있으므로 위험하다
		// stack overflow : 함수가 호출되면 실행할 내용을 펼쳐놓는 메모리(stack)
		rec1();
	}
}
