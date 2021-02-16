package day05;

import java.util.Scanner;

public class Ex02_Scanner_while {
	public static void main(String[] args) throws Exception {
		
		String lyrics = "정말 좋았잖아 행복했었잖아\n" + 
					"가슴 아픈 그런 일들도 견뎌냈던 우리잖아\n";
		Scanner sc = new Scanner(lyrics);	// System.in으로 입력을 받지 않고
											// 문자열을 Scan한다
		
		int cnt = 0;
		
		while(sc.hasNextLine()) {			// 다음 줄이 있으면
			String data = sc.nextLine();	// 다음 줄 내용을 data에 저장하고
			System.out.println(++cnt + " : " + data);	// 출력
			Thread.sleep(750);				// 0.75초 딜레이
		}
		
		Scanner sc2 = new Scanner(lyrics);
		
		while(sc2.hasNextLine()) {				// 다음 줄이 있으면
			String data = sc2.nextLine();		// 다음  줄 내용을 data에 저장하고
			
			int i = 0;							// 글자 단위로 체크할 정수형 변수
			while(i < data.length()) {			// 다음 줄 내용 문자열의 길이만큼 반복
				System.out.print(data.charAt(i));	// 한 글자씩 줄바꿈 없이 풀력
				Thread.sleep(250);					// 0.25초 딜레이
				i++;								// 다음 글자를 위해 i를 1 증가시킨다
			}
			System.out.println();					// 한 줄이 모두 출력되는 줄 바꿈
		}
	
		sc.close();
		sc2.close();
	}
}
