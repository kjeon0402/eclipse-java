package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 이름(문자열)과 생년월일(정수 6자리)을 입력받기
		// 생년월일에서 나머지 연산을 활용하여 년,월,일로 각기 다른 변수에 저장하기
		// 주민등록번호 뒷자리 7자리를 입력받기
		// 뒷자리 중에서 가장 첫번째 숫자가 홀수인지 짝수인지에 따라서 성별을 문자열로 저장하기
		// 결과를 아래 형식으로 출력하기
		// [이름]님은 [yyyy]년 [mm]월 [dd]일 출생이고, [성별]입니다.
		 
		Scanner sc = new Scanner(System.in);
		String name, gender;
		int birth, year, month, day, hideNumber;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("생년월일(6자리) : ");
		birth = sc.nextInt();
		year = birth / 10000;
		month = ((birth % 100000) % 10000) / 100;
		day = (((birth % 100000) % 10000) % 1000) % 100;
		
		System.out.print("주민등록번호 뒷자리(7자리) : ");
		hideNumber = sc.nextInt();
		gender = ((hideNumber / 1000000) % 2 == 0) ? "여자" : "남자";
		
		if(hideNumber / 1000000 == 3 || hideNumber / 1000000 == 4) {
			System.out.printf("%s님은 20%02d년 %02d월 %02d일 출생이고, %s입니다.", name, year, month, day, gender);
		} else {
			System.out.printf("%s님은 19%02d년 %02d월 %02d일 출생이고, %s입니다.", name, year, month, day, gender);
		}
		
		sc.close();
		
	}
}
