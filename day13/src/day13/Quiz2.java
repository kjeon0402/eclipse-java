package day13;

import java.util.Scanner;

class Circle {
	Scanner sc = new Scanner(System.in);
	double radius;
	double pi = 3.14;
	
	// 1. 기본생성자 : Scanner를 이용해서 사용자에게 반지름을 입력받도록 설정하기
	Circle() {
		System.out.print("반지름을 입력하세요 : ");
		radius = sc.nextDouble();	
	}
	
	// 2. 정수를 전달 받아서, radius 필드에 저장하는 생성자
	Circle(int radius) {
		this.radius = radius;
	}
	
	// 3. 실수를 전달 받아서, radius 필드에 저장하는 생성자
	Circle(double radius) {
		this.radius = radius;
	}
	
	// 원의 반지름과 원의 넓이를 소수점 둘째자리까지 출력하고 한 줄 비우기
	void show() {
		System.out.printf("반지름 : %.2f\n", radius);
		System.out.printf("원의 넓이 : %.2fcm²\n\n", radius * radius * pi);
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		
		// Circle 클래스의 객체 3개를 생성하면서, 서로 다른 생성자를 호출
		// 각 개체의 show() 매서드를 호출
		Circle ob1 = new Circle();
		ob1.show();
		Circle ob2 = new Circle(8);
		ob2.show();
		Circle ob3 = new Circle(8.4);
		ob3.show();
	}
}
