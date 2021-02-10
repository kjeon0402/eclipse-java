package stdin;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		// Scanner를 이용하여 이름과 세 과목의 점수를 입력받고
		// 합계와 평균을 계산하여
		// 화면에 출력하세요 (평균은 소수점 첫째 자리까지만 출력하기)
		
		// 1) 코드에서 필요한 변수를 상단에 먼저 선언한다. 초기화가 필요하다면 초기화한다
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		// 2) 사용자에게 입력받아야 하는 값이라면, 입력을 받는다
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		System.out.println();
		
		// 3) 입력받은 값을 이용해 계산하여 변수의 값을 채워 넣는다
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		// 4) 완성된 결과를 화면에 출력한다
		System.out.println("이름 \t: " + name);
		System.out.println("국어 \t: " + kor);
		System.out.println("영어 \t: " + eng);
		System.out.println("수학 \t: " + mat);
		System.out.printf("합계 \t: %d, 평균 : %.1f\n", sum, avg);
		
		sc.close();
	}
}
