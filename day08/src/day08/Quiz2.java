package day08;

public class Quiz2 {
	// 여기에 함수를 작성하세요
	// "" 빈 문자열을 충분히 활용하세요. 문자열에 다른 값을 더하면 이어붙이기가 됩니다. String.format()
	static String makeStr(char ch, int n) {
		String c = "";		// 반환할 값의 변수
		
		for(int i = 0; i < n; i++) {	// n 횟수만큼 반복하여 실행하겠다
			c = c + ch;
		}
		return c;
	}
	static String getDate(int n) {
		String str = "%4d-%02d-%02d";	// 미리 서식을 정 해두고, 값만 넣으면 데이터가 완성되도록
		
		int dd = n % 100;
		int mm = (n / 100) % 100;
		int yy = n / 10000;
		
		yy = yy + ((yy > 21) ? 1900 : 2000);
		
		str = String.format(str, yy, mm, dd);
//		String str = String.format("19%2d-%02d-%02d\n",yy,mm,dd);
		return str;
	}
	
	public static void main(String[] args) {
		
		// 1) 글자 하나와 정수 하나를 전달받아서, 글자를 정수 개수만큼 이어붙인 문자열을 반환하는 함수를 만드세요
		String q1 = makeStr('=', 10);
		System.out.println("q1 : " + q1);	// ==========
		
		// 2) 생년월일을 정수로 전달하면 "yyyy-MM-dd"의 형식으로 문자열로 날짜를 반환하는 함수를 만드세요
		String q2 = getDate(930516);
		System.out.println("q2 : " + q2);	// 1993-05-16
	}
}
