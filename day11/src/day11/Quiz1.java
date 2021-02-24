package day11;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// Ex05에서 사용한 while과 switch ~ case를 이용하여 메뉴를 구성하는 패턴으로 프로그램을 작성한다
		// 1. 사람 이름 추가		: 빈 칸에만 이름을 작성할 수 있다(null)
		// 2. 전체 출력			: 빈 칸은 출력하지 않는다(null)
		// 3. 검색			: 문자열은 ==으로 비교하지 않고, A.equals(B)로 비교한다
							// 전체를 탐색해도 없으면 없다라고 출력
		// 0. 종료
		
		// 데이터를 저장할 수 있는 배열이 제공됩니다. 배열이 모두 꽉 찼으면 더이상 추가할 수 없다는 메시지를 출력하세요
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1. 이름 추가");
			System.out.println("2. 전체 출력");
			System.out.println("3. 검색");
			System.out.println("0. 종료");
			System.out.print("번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1: 
					System.out.println("이름 추가");
					// 어떻게 이름을 입력받아서 배열의 빈 칸 하나에 추가할 것인가?
					for(int i = 0; i < arr.length; i++) {
						if(arr[i] == null) {					// 빈 칸이면
							System.out.print("추가할 이름 입력 : ");	// 메시지 출력해서
							arr[i] = sc.next();					// 입력받는다
							break;
						}
						if(i == 4) {
							System.out.println("빈 칸이 없습니다.");
						}
					}
					break;
					
				case 2:
					System.out.println("전체 출력");
					// 어떻게 빈 칸을 제외하고 값이 있는 곳만 출력할 것인가?
					for(int i = 0; i < arr.length; i++) {
						if(arr[i] != null) {
							System.out.println(arr[i]);
						}
					}
					System.out.println();
					break;
				case 3:
					System.out.print("검색할 이름을 입력하세요 : ");
					// 어떻게 문자열을 비교하고 있음/없음의 유무를 출력할 것인가?
					String searchName = sc.next();
					for(int i = 0; i < arr.length; i++) {
						if(searchName.equals(arr[i])) {
							System.out.println(searchName + " : 데이터를 찾았습니다.");
							break;
						}
						if(i == arr.length - 1) {
							System.out.println(searchName + " : 데이터를 찾을 수 없습니다.");
						}
					} break;
			}			
		} while(menu != 0);
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
