package day10;

public class Ex02 {
	// 문자열의 대소관계를 정수 형태로 반환하는 함수
	// 일치하는 문자열이면 0, 첫 번째 문자열의 글자 코드값이 더 작으면 -1, 두 번째 문자열의 글자 코드값이 더 작으면 1
	static int compare(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		int length = arr1.length < arr2.length ? arr1.length : arr2.length;
		
		for(int i = 0; i < length; i++) {
			if(arr1[i] > arr2[i]) return 1;
			if(arr1[i] < arr2[i]) return -1;
			// 첫 번째 글자에서 대소관계가 결정되면 곧바로 반환하면 된다(return은 함수의 종료)
			// 첫 번째 글자에서 값이 일치하면 다음 글자를 비교해야 하므로, return하지 않는다
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String name1 = "Chris";
		String name2 = "Robert";
		String name3 = "Chris";
		
		int test1 = compare(name1, name2);
		int test2 = compare(name2, name1);
		int test3 = compare(name3, name1);
		int test4 = compare("홍길동", "홍진호");
		
		System.out.printf("%d, %d, %d, %d\n", test1, test2, test3, test4);
		// -1, 1, 0, -1
	}
}
