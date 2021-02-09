package stdin;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		// Scanner를 이용하여 이름과 세 과목의 점수를 입력받고
		// 합계와 평균을 계산하여
		// 화면에 출력하세요 (평균은 소수점 첫째 자리까지만 출력하기)
		
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		System.out.printf("합계 : %d, 평균 : %.1f", sum, avg);
		
		sc.close();
	}
}
