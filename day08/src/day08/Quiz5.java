package day08;

import java.util.Scanner;

public class Quiz5 {
	
	static String getTime(int station) {
		int sum = 0;
		
		for(int i = 0; i < station; i++) {
			sum = sum + 2;
		}
				
		return sum >= 60 ? String.format("%d시간 %d분", sum / 60, sum % 60) : String.format("%d분", sum);
	}
	
	public static void main(String[] args) {
		// 지하철을 타고 이동하려고 한다
		// 지하철 한 구간 당 2분이 소요된다고 가정한다면
		// 이동한 구간 수를 입력받아서, 시간을 출력하려고 한다
		// 정수로 구간 수를 전달 받아서, 문자열로 시간을 반환하는 함수를 작성하세요
		// 단, 60분을 초과하는 시간에 대해서는 시간과 분을 따로 출력하고
		// 60분 이하의 시간에 대해서는 분만 출력하도록 처리해야 한다 (String.format() 활용)
		
		Scanner sc = new Scanner(System.in);
		int station;
		
		System.out.print("이동한 구간 수 입력 : ");
		station = sc.nextInt();
		String result = getTime(station);
		System.out.println(result);
		
		sc.close();
	}
}
