package day08;

public class Ex03_parseInt {
	
	static int parseInt(String str) {
		int ret = 0;
		for(int i = 0; i < str.length(); i++) {
			ret = ret * 10;
			ret = ret + str.charAt(i) - 48;
			// char 자료형에서 숫자 0을 나타내는 값의 아스키 코드가 48
			// 48  49  50  51  52  53  54  55  56  57	ASCII Code
			// '0' '1' '2' '3' '4' '5' '6' '7' '8' '9'	number
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int num = parseInt("1234");
		System.out.println(num + 1); 	// 1235
	}
}