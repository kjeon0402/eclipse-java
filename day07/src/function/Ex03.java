package function;

public class Ex03 {

	// 1) 함수의 정의(definition), 정의되지 않은 함수는 사용(호출)할 수 없다
	static int add(int n1, int n2) {	// 3) 매개 변수에는 인자값이 순서대로 전달된다
	//    반환자료형 함수이름(매개변수) {
	//  4) 함수의 몸체(body), 함수가 수행해야할 코드를 작성한다. 매개변수를 참조하여 작성할 수 있다
	// }
		int ret = n1 + n2;
		return ret;		// 5) return은 함수의 종료를 의미, 마지막에 값 하나를 호출위치로 돌려줄 수 있다
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int result = add(num1, num2);	// 2) 함수의 호출, 이름을 불러 호출하며 ()안에 인자값을 전달환다
										// 함수가 호출되면 인자가 매개변수에 전달되며
										// 실행 코드가 함수의 정의로 이동한다
										// 6) 함수의 반환값 호출을 대체하며, 대입 및 연산, 출력에 사용된다
		System.out.println(result);
	}
}
