package day16;

class Card {				// 다음 멤버 필드 중, 객체마다 다른 값을 가지는 멤버 필드와, 객체 간에 같은 값을 가지는 멤버 필드를 구분하세요
	static int size = 7;	// 공유 : static 속성을 부여하면, 객체가 아닌 클래스에 소속된다
	static int width;		// 공유
	static int height;		// 공유
	String num;				// 개별
	String pattern;			// 개별
	
	public Card(String num, String pattern) {
		this.num = num;
		this.pattern = pattern;
		// 사이즈를 지정하지 않으면 처리되는 기본값
		width = (int)(size * 1.4);	// this는 객체 자기자신을 가리키는 키워드이다(this.)
		height = size;
	}
//	public static int getSize() {
//		return size;
//	}	
	public static void setSize(int size) {
		Card.size = size;	// [this.필드] 대신 [클래스이름.필드]
		width = (int)(size * 1.4);		// 겹치는 지역변수가 없으므로 Card. 생략 가능
		height = size;
	}
	
	public void show() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(i == 0 && j == 0) {
					System.out.print("┌");
				} else if(i == height - 1 && j == 0) {
					System.out.print("└");
				} else if(i == height - 1 && j == width - 1) {
					System.out.print("┘");
				} else if(i == 0 && j == width - 1) {
					System.out.print("┐");
				} else if(i == 0 || i == height - 1) {
					System.out.print("─");
				} else if(j == 0 || j == width - 1) {
					System.out.print("│");
				} else if(i == 1 && j == 1){
					System.out.printf("%-2s", num);
				} else if(i == height - 2 && j == width - 2) {
					System.out.printf("%2s", num);
				} else if(i == 1 && j == 2) {
					System.out.print("");
				} else if(i == height - 2 && j == width - 3) {
					System.out.print("");
				} else if(i == 2 && j == 1) {
					System.out.printf("%s", pattern);
				} else if(i == height - 3 && j == width - 2) {
					System.out.printf("%s", pattern);
				} else {
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
	}
}

public class Quiz4 {
	public static void main(String[] args) {
		// 모든 카드의 크기를 조절하는 메서드 setSize를 Card 클래스에 작성하고, 작동을 테스트하세요
		Card ob1 = new Card("A", "♠");
		Card ob2 = new Card("J", "♣");
		Card ob3 = new Card("Q", "♥");
		
		Card.setSize(10);
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
