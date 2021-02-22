package day09;

public class Ex01 {
	public static void main(String[] args) {
		String name1 = "이지은";
		String name2 = "홍진호";
		String name3 = "유재석";
		
		int age1 = 29;
		int age2 = 40;
		int age3 = 45;
		
		System.out.printf("%s님의 나이는 %d살입니다.\n", name1, age1);
		System.out.printf("%s님의 나이는 %d살입니다.\n", name2, age2);
		System.out.printf("%s님의 나이는 %d살입니다.\n", name3, age3);
		
//		for(int i = 0; i < 3; i++) {
//			System.out.printf("%s님의 나이는 %d살입니다.\n", name + i, age + i);
//		}
		
		// "같은 자료형"의 "여러 데이터"를 연속된 메모리 공간에 배치하여 저장하기(순서, 순번)
		// 하나의 배열 안에 있는 각 데이터는 배열의 멤버, 배열의 요소라고 부른다
		// 배열의 멤버 변수는 일반 변수와 동일하게 대입, 참조, 출력이 가능하다(Array)
		String[] nameArr = {"이지은", "홍진호", "유재석"};
		int[] ageArr = {29, 40, 45};
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s님의 나이는 %d살입니다.\n", nameArr[i], ageArr[i]);
		}
	}
}
