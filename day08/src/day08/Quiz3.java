package day08;

import java.util.Scanner;

public class Quiz3 {	// y = f(x)
	// BMI, 체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
	// 0 ~ 18.5 	저체중
	// 18.5 ~ 23	정상
	// 23 ~ 25.00	과체중
	// 25 ~ 		비만
	static double getObesityRate(double height, double weight) {
		return weight / ((height / 100) * (height / 100));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double height, weight, rate;
		
		System.out.print("현재 키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
		System.out.print("현재 체중을 입력하세요(kg) : ");
		weight = sc.nextDouble();
		
		rate = getObesityRate(height, weight);
		System.out.printf("BMI : %.2f%%\n", rate);
		
		sc.close();
	}
}
