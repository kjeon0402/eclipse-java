package day04_controlStatement;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 세 과목 성적을 입력받고 평균을 계산하여, 평균에 따라서 평점을 출력하세요
		// 만약 평균이 0점 미만이거나 100점 초과이면 평점을 F로 처리하도록 만들어보세요
		// (if는 작성한 순서대로 조건을 체크한다 = 먼저 확인할 조건이 위에 있어야 한다)
		
		// 90 ~ 100이하 	: A
		// 80 ~ 90미만 	: B
		// 70 ~ 80미만 	: C
		// 60 ~ 70미만 	: D
		// 60미만		 	: F
		
		Scanner sc = new Scanner(System.in);
		int kor, mat, eng;
		double avg;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		avg = (kor + mat + eng) / 3.0;
		
		if(avg >= 90 && avg <= 100) {
			System.out.printf("평균 : %.2f, 평점 : A", avg);
		} else if(avg >= 80 && avg < 90) {
			System.out.printf("평균 : %.2f, 평점 : B", avg);
		} else if(avg >= 70 && avg < 80) {
			System.out.printf("평균 : %.2f, 평점 : C", avg);
		} else if(avg >= 60 && avg < 70) {
			System.out.printf("평균 : %.2f, 평점 : D", avg);
		} else {
			System.out.printf("평균 : %.2f, 평점 : F", avg);
		}
		
		sc.close();
	}
}
