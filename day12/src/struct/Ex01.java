package struct;

class Human {		// 구조체라고 가정(struct)
	String name;	// Human이라는 자료형은 내부에 String형식으로 name변수를 갖고 있다
	int age;		// Human이라는 자료형은 내부에 int형식으로 age변수를 갖고 있다
}

public class Ex01 {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		
		h1.name = "이지은";
		h1.age = 29;	// 서로 다른 자료형의 데이터를 하나의 변수 안에 묶어서 저장한다
		
		System.out.println(h1);
		System.out.println(h1.name);
		System.out.println(h1.age);
		
		// 기본 자료형만으로는 일상생활과 사고체계에 존재하는 모든 사물을 표현하는 데에 무리가 있다
		// 기본 자료형은 컴퓨터가 연산(계산)하기 위해서 존재하는 자료형이고
		// 프로그램은 사람의 일을 돕는 역할이므로, 사람의 사고체계 수준에 맞는 자료형이 필요하다
		
		// 변수 : 데이터가 어떤 유형의 정보를 저장하는지 자료형이 필요하다. 데이터를 저장하는 공간
		// 단일 데이터 저장
		
		// 배열 : 같은 자료형의 데이터를 연속된 공간에 묶어서 관리하는 자료구조
		// 같은 자료형의 여러 데이터 저장
		
		// 구조체 : (C언어) 서로 다른 자료형의 데이터를 묶어서 관리할 수 있는 사용자 정의 자료형
		// 다른 자료형의 여러 데이터 저장
		
		// 클래스 : 구조체가 가지지 못하는 특징을 추가하여, 서로 다른 데이터 + 기능(메서드)을 가지도록 하는 자료형
	}
}
