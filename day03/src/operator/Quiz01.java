package operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 이름(문자열)과 생년월일(정수 6자리)을 입력받기
		// 생년월일에서 나머지 연산을 활용하여 년,월,일로 각기 다른 변수에 저장하기
		// 주민등록번호 뒷자리 7자리를 입력받기
		// 뒷자리 중에서 가장 첫번째 숫자가 홀수인지 짝수인지에 따라서 성별을 문자열로 저장하기
		// 결과를 아래 형식으로 출력하기
		// [이름]님은 [yyyy]년 [mm]월 [dd]일 출생이고, [성별]입니다.
		 
		Scanner sc = new Scanner(System.in);
		String name, gender;
		int birth, year, month, date, idNumber2;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("생년월일 입력(6자리) : ");
		birth = sc.nextInt();
		
		System.out.print("주민등록번호 뒷자리(7자리) : ");
		idNumber2 = sc.nextInt();
		
		date = birth % 100;
		birth /= 100;
		month = birth % 100;
		year = birth / 100;
//		year += year > 21 ? 1900 : 2000;	// 1920년 이전의 연령을 체크할 수 없다
		
		gender = (idNumber2 / 1000000) % 2 == 0 ? "여성" : "남성";
		
		// 새로 추가한 코드
		int num1 = idNumber2 / 1000000;
		num1 += (num1 % 2 != 0) ? 1 : 0;
		num1 -= num1 > 9 ? 10 : 0;
		num1 /= 2;
		year += 1800 + num1 * 100;
		
		String msg = "[%s]님은 [%4d]년 [%2d]월 [%2d]일 출생이고, [%s]입니다.\n";
		System.out.printf(msg, name, year, month, date, gender);
		
		sc.close();
		
	}
}
