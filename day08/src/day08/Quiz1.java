package day08;

public class Quiz1 {
	// 여기에 함수를 작성하세요
	static int getMaxNum(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		return max;
//		if(n1 > n2 && n1 > n3) {
//			return n1;
//		} else if(n2 > n1 && n2 > n3) {
//			return n2;
//		} else {
//			return n3;
//		}
	}
	static boolean checkLength10(String str) {
		if(str.length() >= 10) {
			return true;
		} else {
			return false;
		}
	}
	static boolean isNumeric(String string) {
		// 문자열은 자체적으로 문자열의 길이를 알아낼 수 있는 함수가 제공된다
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) < '0' || string.charAt(i) > '9') {
				return false;	// return은 값을 반환하기도 하지만, 즉각적인 함수의 종료를 의미한다
			}
		}
		return true;	// 자료형이 boolean일 경우 정수의 0에 해당하는 false를 기본값으로 처리
		
//		char ck;
//		for(int i = 0; i < string.length(); i++) {
//			ck = string.charAt(i);
//			if(ck >= 0 && ck <= 9) {
//				return true;
//			} else {
//				return false;
//			}		
//		}
	}
	static int getSummary(String arr) {
		int sum = 0;
		if(isNumeric(arr) == false) {	// 내가 만든 함수에서도 다른 함수를 호출하여 사용할 수 있다
			return 0;
		}
		// 여기까지 도달했다면 arr은 모두 숫자로 구성된 문자열이다
		for(int i = 0; i < arr.length(); i++) {
			sum = sum + arr.charAt(i) - 48;
		}
		return sum;
//		int i = Integer.parseInt(arr);
//		int sum = 0;
//		while(i != 0) {
//			sum = sum + i % 10;
//			i = i / 10;
//		}
//		return sum;
	}
			
	
	public static void main(String[] args) {	
		// main함수가 static속성이므로, main에서 호출할 다른 함수도 static속성을 가져야 한다
		// 함수를 호출할 때에는  : 함수이름(매개변수)
		// 함수를 정의할 때에는  : 반환형 함수이름(매개변수)
		
		// 1) 세 정수 중 가장 큰 수를 반환하는 함수
		int q1 = getMaxNum(3,6,2);						// 6
		
		// 2) 문자열의 길이가 10 이상인지 아닌지 true / false를 반환하는 함수
		boolean q2 = checkLength10("Hello, world!!");	// true
		
		// 3) 문자열의 각 글자가 모두 숫자로 되어 있는지 반환하는 함수
		boolean q3 = isNumeric("1234");					// true
		
		// 4) 문자열을 구성하는 각 글자가 숫자로 되어 있으면, 각 자릿수의 합을 반환하는 함수
		int q4 = getSummary("123456789");				// 45
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		
	}
}
