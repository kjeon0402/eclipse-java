package struct;

import java.util.Scanner;

// Ex04를 참조하여, 자신만의 전화번호부 프로그램을 만들어보세요
class phoneNumber {
	String name;
	String number;
}

public class Quiz {
	
	static void addNumber(phoneNumber[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new phoneNumber();
				System.out.print("이름 입력 : ");
				arr[i].name = sc.next();
				System.out.print("전화번호 입력('-' 포함) : ");
				arr[i].number = sc.next();
				break;
			}
			System.out.println();
		}
	}
	
	static void listNumber(phoneNumber[] arr) {
		
		System.out.println("========================");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s : %s\n", arr[i].name, arr[i].number);
			}
		}
		System.out.println("========================");
	}
	
	static phoneNumber findNumber(phoneNumber[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 이름 : ");
		String find = sc.next();

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && find.equals(arr[i].name)) {
				System.out.println("========================");
				System.out.printf("%s : %s\n", arr[i].name, arr[i].number);
				System.out.println("========================");
				return arr[i];
			}
		}
		System.out.println("존재하지 않는 번호입니다.");
		return null;
	}
	
	static void removeNumber(phoneNumber[] arr) {
		
		phoneNumber target = findNumber(arr);
		String name = null;
		if(target != null) {
			name = target.name;
		}
		
		for(int i = 0; i < arr.length && arr[i] != null; i++) {
			if(arr[i].name.equals(name)) {
				arr[i] = null;
				return;
			}
		}	
	}
	
	public static void main(String[] args) {
		phoneNumber[] arr = new phoneNumber[100];
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		SYSTEM: do {
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 목록");
			System.out.println("3. 전화번호 검색");
			System.out.println("4. 전화번호 삭제");
			System.out.println("0. 종료");
			System.out.print("번호 입력 : ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 0: break SYSTEM;
				case 1: addNumber(arr); 	break;
				case 2: listNumber(arr); 	break;
				case 3: findNumber(arr);	break;
				case 4: removeNumber(arr);	break;
			}
			
		} while(menu != 0);
		
		System.out.println("프로그램이 종료됩니다.");
	}
}
