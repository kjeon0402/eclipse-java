package day10;

public class Ex01 {
	public static void main(String[] args) {
		// 문자열도 선택정렬이 가능한가? (영문 혹인 한글 오름차순 or 내림차순)
		
		// String(문자열, 단일 문자가 배열과 유사한 형태로 늘어서 있는 형태)
		// 모든 String은 toCharArray();
		// '0' = 48, 'A' = 65, 'a' = 97, ' ' = 32, '\n' = 10, '\r' = 13
		// index	    0123456789...
		String name1 = "Robert Downey Jr";
		String name2 = "Chris Evans";
		
		name1 = name1.toUpperCase();	// 문자열을 모두 대문자로 변경하여 반환한다
		name2 = name2.toUpperCase();	// 문자열.toLowerCase() : 문자열을 모두 소문자로 변경하여 반환한다
		
		char[] arr1 = name1.toCharArray();	// 문자열을 char[] 형태로 반화하는 함수(기능)
		char[] arr2 = name2.toCharArray();
		
		int length = arr1.length < arr2.length ? arr1.length : arr2.length;
		
		for(int i = 0; i < length; i++) {
			System.out.printf("%c, %c : %b\n", arr1[i], arr2[i], arr1[i] < arr2[i]);
		}
		System.out.println();
	}
}
