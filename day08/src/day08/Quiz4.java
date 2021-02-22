package day08;

// 자바의 문자열 함수는 여러 기능이 있습니다
// 이런 기능은 없을까? 궁금하다면 구글에서 검색하세요

public class Quiz4 {
	
	static boolean isVaildNumber(long number) {
		long sum = 0;
		// 변수 cardNum에 long 형태의 number을 문자열(String)로 저장
		String cardNum = "" + number;
		int length = cardNum.length();
		long changeNumber = 0;
		
		if(length != 16) {
			return false;
		} else {
			for(int i = 0; i < length; i++) {
				int nn = cardNum.charAt(i) - 48;
				nn = nn * ((i % 2 == 0) ? 2 : 1);
				if(nn / 10 == 0) {
					changeNumber = changeNumber * 10 + nn;
				} else {
					nn = (nn % 10) + (nn / 10);
					changeNumber = changeNumber * 10 + nn;
				}
			}
			while(changeNumber != 0) {
				sum = sum + (changeNumber % 10);
				changeNumber = changeNumber / 10;
			}
			if(sum % 10 != 0) {
				return false;
			} 
		} 
		return true;
	}
	static boolean isVaildNumber(String number) {
		long sum = 0;
		long changeNumber = 0;
		number = number.replace("-","");
		int length = number.length();
		
		if(length != 16) {
			return false;
		} else {
			for(int i = 0; i < length; i++) {
				int nn = number.charAt(i) - 48;
				nn = nn * ((i % 2 == 0) ? 2 : 1);
				if(nn / 10 == 0) {
					changeNumber = changeNumber * 10 + nn;
				} else {
					nn = (nn % 10) + (nn / 10);
					changeNumber = changeNumber * 10 + nn;
				}
			}
			while(changeNumber != 0) {
				sum = sum + (changeNumber % 10);
				changeNumber = changeNumber / 10;
			}
			if(sum % 10 != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		// 카드 번호 유효성 검사 알고리즘 구현하기(함수)
		// Luhn 알고리즘
		
		// 1. 카드번호 16자리를 입력받는다
		// 2. 우측부터 세어서 홀수번째는 그대로 두고, 짝수번째는 2를 곱한다
		// 3. 만약 곱한 숫자가 두자리 숫자가 되면 각 자릿수를 더하여 한자리수로 만든다
		// 4. 이렇게 만들어진 각 16자리의 숫자의 합을 구한다
		// 5. 합이 10으로 나누어 떨어지면 유효한 카드번호, 그렇지 않으면 유효하지 않은 카드번호이다
		
		boolean bo1 = isVaildNumber(2720992711828767L);		// long
		boolean bo2 = isVaildNumber("3444063910462763");	// String, 16
		boolean bo3 = isVaildNumber("6011-7338-9510-6094");	// String, 19
		
		
		System.out.println(bo1);	// true
		System.out.println(bo2);	// false
		System.out.println(bo3);	// true
	}
	
}
