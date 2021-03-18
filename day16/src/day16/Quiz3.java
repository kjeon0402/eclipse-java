package day16;

class Square3 {		// 다음 멤버 필드 중, 객체마다 다른 값을 가지는 멤버 필드와, 객체 간에 같은 값을 가지는 멤버 필드를 구분하세요
	int size = 7;	// 공유
	int width;		// 공유
	int height;		// 공유
	String num;		// 개별
	String pattern;	// 개별
	
	public Square3(String num, String pattern) {
		this.num = num;
		this.pattern = pattern;
		this.width = (int)(size * 1.4);
		this.height = size;
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

public class Quiz3 {
	public static void main(String[] args) {
		Square3 ob1 = new Square3("A", "♠");
		Square3 ob2 = new Square3("J", "♣");
		Square3 ob3 = new Square3("Q", "♥");
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
