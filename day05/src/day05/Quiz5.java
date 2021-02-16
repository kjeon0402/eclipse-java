package day05;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		// ########## 100% ##########
		
		// 위 형식의 설치 진행률 표시를 만들려고 한다
		// 진행률을 정수로 입력받아서 개수에 따라서 # 기호가 출력되고
		// 진행률 숫자는 가운데 출력되는 형식을 만드세요
		// # 기호 하나는 5%를 의미합니다
		
		Scanner sc = new Scanner(System.in);		
		int j;
		
		System.out.print("정수를 입력하세요(0 ~ 100) : ");
		j = sc.nextInt();
		
		System.out.print("[");
		for(int i = 0; i < 20; i++) {
			if(i == 10)
				System.out.printf(" %3d %% ", j);
			
			if(i < j / 5) { 
				System.out.print("#");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		
		sc.close();
	}
}
