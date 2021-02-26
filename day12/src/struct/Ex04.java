package struct;

import java.util.Scanner;

// 내가 프로그램에서 사용할 자료형을 정의한다
class Item {
	String name;
	int price;
}

public class Ex04 {
	
	// 그외, 내 프로그램에서 자주 호출되는 기능을 정의해 둔다
	static void addItem(Item[] arr) {
		// 매개변수는 지역변수인데 여기서 추가하면 과연 메인에도 추가될까?
		Scanner sc = new Scanner(System.in);		// 메인의 sc와는 다르다
		
		for(int i = 0; i < arr.length; i++) {		// 전체 공간 중에서
			if(arr[i] == null) {					// 가장 앞쪽의 빈 칸을 찾아서
				arr[i] = new Item();				// 새로운 아이템을 생성하고
				System.out.print("상품 이름 입력 : ");	// 이름과 가격을 입력 받고
				arr[i].name = sc.next();
				System.out.print("상품 가격 입력 : ");
				arr[i].price = sc.nextInt();
				break;								// 빈 칸이나 아이템 하나 추가했으니 반복을 중단
			}
			System.out.println();
		}
	}
	
	// 목록 출력
	static void listItem(Item[] arr) {
		System.out.println("==================================");
		for(int i = 0; i < arr.length; i++) {	// 여기에서 어긋나면 반복을 더이상 하지 않음
			if(arr[i] != null) {	// 여기에서는 어긋나도 반복을 계속하고 출력만 안함
				System.out.printf("%s : %,d\n", arr[i].name, arr[i].price);
			}
		}
		System.out.println("==================================");
	}
	
	// 상품 검색
	static Item searchItem(Item[] arr) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색하실 상품의 이름을 입력하세요 : ");
		String search = sc.next();
		for(int i = 0; i < arr.length && arr[i] != null; i++) {
			if(search.equals(arr[i].name)) {
				System.out.println("==================================");
				System.out.printf("%s : %,d\n", arr[i].name, arr[i].price);
				System.out.println("==================================");
//				break;
//				return;
				return arr[i];
			}
		}
		System.out.println("없는 상품입니다.");
		return null;
	}

	// 상품 삭제
	static void removeItem(Item[] arr) {
		// 추가하기 전에 배열에 담긴 값은 무엇?	null
		Item target = searchItem(arr);	// 내가 만든 함수를 활용해서 코드를 전개하는 것도 가능하다
		String itemName = null;
		if(target != null) {
			itemName = target.name;
		}
		
		for(int i = 0; i < arr.length && arr[i] != null; i++) {
//			if(arr[i].equals(target)) {	// 문자열 뿐만 아니라, class로 만들어진 객체도 equals 사용 가능
//				arr[i] = null;
//			}
			if(arr[i].name.equals(itemName)) {
				arr[i] = null;
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		// 프로그램에서 사용되는 데이터를 저장할 변수(배열 or 구조체 or 객체)를 선언한다
		Item[] arr = new Item[100];
		
		// 프로그램이 시작되는 작동하는 기본 구조를 설정한다(입출력)
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		SYSTEM: do {
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 목록");
			System.out.println("3. 상품 검색");
			System.out.println("4. 상품 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 >>> ");
			menu = sc.nextInt();
			
			switch(menu) {
//				case 0: break;			// switch를 빠져나가고 보니 while의 조건에서 반복이 중단
				case 0: break SYSTEM;	// switch가 아닌 do ~ while을 탈출하는 용도의 break
				case 1: addItem(arr); 		break;
				case 2: listItem(arr); 		break;
				case 3: searchItem(arr); 	break;
				case 4: removeItem(arr);	break;
				default:
					System.out.println("잘못된 번호를 입력하셨습니다.");
			}
			
		} while(menu != 0); 
		
		System.out.println("프로그램을 종료합니다.");
	}
}
