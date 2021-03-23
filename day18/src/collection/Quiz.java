package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class FoodSelector {
	// 여러분의 식사 메뉴 선정을 도와주는 클래스를 작성하세요
	// Map형식을 활용하여 정수형의 key와 문자열의 메뉴이름을 value로 저장할 수 있게 하고
	// 메뉴는 사용자가 직접 추가 가능하게끔 Scanner를 이용하여 메뉴 이름을 입력받아서 추가합니다	
	// 메뉴를 랜덤으로 추천하기 위해서, Random클래스를 이용하여 지정된 범위 안에서 정수를 추출하고
	// 해당 정수를 Map에 key로 제시하여, value를 받으면 해당 메뉴를 화면에 출력해주는 클래스
	private HashMap<Integer, String> map = new HashMap<Integer, String>();
	private Random ran = new Random();
	
	// 추가
	public void addMenu(String foodName) {
		int key = map.size();	// 데이터가 없을 때에는 key : 0
		map.put(key, foodName);	// 데이터가 있으면 인덱스가 0부터 시작하므로, index + 1번을 키로 사용
	}

	// 랜덤으로 하나 반환
	public String selectMenu() {
		if(map.size() == 0) {
			return "등록된 메뉴가 없습니다.";
		}
		int key = ran.nextInt(map.size());
		String foodName = map.get(key);
		return foodName;
	}
	
	// 메뉴
	public void listMenu() {
//		for(String food : map.values()) {
//			System.out.println(food);
//		}
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			String value = map.get(key);
			System.out.println((key + 1) + ". " + value);
		}
	}
	
	// 프로그램 메뉴
	public void showMenu() {
		System.out.println("1. 메뉴 선택 도우미");
		System.out.println("2. 식사 메뉴 추가");
		System.out.println("3. 목록과 개수 출력");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호 선택 : ");
	}
	
	// 현재 총 개수
	public int getsize() {
		return map.size();
	}
}

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodSelector fs = new FoodSelector();
		
		// while, switch ~ case 메뉴구성 : 1. 메뉴 선택 도우미 2. 식사 메뉴 추가 3. 목록과 개수 출력 0. 종료
		int menu = 0;
		
		SYSTEM: do {
			fs.showMenu();
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 0: break SYSTEM;
				case 1: 
					String food = fs.selectMenu();
					System.out.println("오늘의 추천 메뉴 : " + food);
					break;
				case 2:
					System.out.print("추가할 메뉴 이름을 입력 : ");
					String foodName = sc.nextLine();
					fs.addMenu(foodName);
					break;
				case 3: 
					System.out.println("현재 음식 메뉴의 개수 : " + fs.getsize());
					System.out.println("=== 음식 목록 ===");
					fs.listMenu();
					System.out.println("=============");
					break;
				default: System.out.println("잘못 선택하셨습니다.");
			}
		} while(menu != 0);
		System.out.println("시스템을 종료합니다.");
		sc.close();
	}
}
