package function;

public class Ex02 {
	// 정수를 num으로 입력받아서, 정수의 자릿수를 뒤집고, 그 결과를 반환하는 기능(함수)
	// y = f(x)
	static int reverseNumber(int num) {	// 전달받은 값을 저장할 변수, 매개변수
		int tmp = 0;
		while(true) {
			tmp = tmp + num % 10;
			num = num / 10;
			if(num == 0) break;
			tmp = tmp * 10;
		}
		return tmp;	// 최종 결과를 호출한 위치에 반환(어떤 자료형의 값을 반환하는지?)
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));	// 함수의 이름을 불러서 호출하고 인자를 전달한다
		System.out.println(reverseNumber(13579));
		System.out.println(reverseNumber(918273645));
		int x = 1423;
		int y = reverseNumber(x);
		System.out.println(y);
		
		// 함수는 내가 자주 사용할 코드를 묶어놓은 집합이다
		
		int num = 1234;
		int tmp = 0;
		while(true) {
			tmp = tmp + num % 10;
			num = num / 10;
			if(num == 0) break;
			tmp = tmp * 10;
		}
		System.out.println(tmp);
		
	}
}
