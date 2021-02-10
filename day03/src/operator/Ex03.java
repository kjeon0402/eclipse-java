package operator;

public class Ex03 {
	public static void main(String[] args) {
		
		// 삼항연산자 : 하나의 값을 결정하는 연산식, 조건에 따라서 A값 혹은 B값이 될 수 있다
		// flag ? A : B
		// flag가 참이면 A, flag가 거짓이면 B가 값이 된다
		// 값을 출력하거나 대입하거나 증감연산하는 등 다양하게 활용할 수 있다
		
		// 조건에 따라서 서로 다른 값을 출력하고 싶을 때(둘 중 하나 선택)
		int age = 27;
		System.out.println(age >= 20 ? "성인" : "미성년자");
		
		String adult = age >= 20 ? "성인" : "미성년자";
		System.out.println(adult);
		
		// int c = a + b;
		// 페이징 : 게시글이 많으면 한 화면에 출력하기 힘들어서 여러 페이지로 나누어서 처리하는 작업
		// 게시글의 총 개수 : 147개
		// 한 화면 당 출력할 게시글의 개수 : 10개
		// 이 때 총 몇 페이지로 나누어서 출력할 것인가?
		int boardCount = 147;
		int perPage = 10;
		int page = boardCount / 10;
		page += (boardCount % perPage == 0) ? (0) : (1);
		System.out.println("페이지의 수 : " + page);
		
	}
}
