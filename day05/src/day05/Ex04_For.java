package day05;

public class Ex04_For {
	public static void main(String[] args) {
		
		// for문도 반복을 처리하는 제어문이다
		// while과 바꿔 사용할 수도 있으나, 보통 횟수가 정해진 반복을 처리하는데에 주로 사용한다
		
		// 1) 지정한 횟수에 의해서 반복을 처리할 때
		//		(1)		(2)		(4)
		for(int i = 0; i < 5; i++) {
			System.out.println("FOR");	// (3)
		}
		// (1) 반복을 제어할 변수 선언 및 초기화, 이미 선언된 변수라면 자료형을 명시하지 않는다
		// (2) 반복이 수행될 조건(true / false), while의 조건과 동일
		// (3) 조건이 참이면 실행할 코드
		// (4) 증감식, 변수를 증가시키거나, 감소시키는 코드
		
		// 1 - 2 - 3 - 4 - 2 - 3 - 4 - ...
		
		int i = 0;
		while(i < 5) { 
			System.out.println("WHILE");
			i++;
		}
		
		// for문 안에서 if 사용하기
		for(int j = 1; j < 100; j++) {
			if(j % 17 == 0) {
				System.out.println(j);
			}
		}
		System.out.println();
		
		// 문자열과 연계하여 사용하기
		String[] names = {"김동연", "문인성", "배국한", "윤시원", "이수현", "정수은"};
		
		for(i = 0; i < 6; i++) {	// 이미 선언된 변수는 자료형을 명시하지 않으면 초기화하여 사용할 수 있다
			String name = names[i];	// i번째 데이터를  name이라고 할 때
			if(name.contains("수")) {	// name이 "수"라는 글자를 포함하면
				System.out.println(name);	// 출력해라
			}
		}
	}
}
