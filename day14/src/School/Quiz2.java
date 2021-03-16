package School;

import java.util.Scanner;

class Student {	// 프로그램에서 다루어야 할 데이터의 유형을 정의하는 클래스
	// 학생의 이름과 3개의 과목(국영수)의 합계, 평균을 저장하는 필드
	private String name;
	private int kor, eng, mat, sum;
	private double avg;
	
	// 이름과 3개 과목을 매개변수로 전달 받는 생성자 작성
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = kor + eng + mat;
		this.avg = sum / 3.0;
		// 멤버 필드의 초기값을 지정할 뿐 아니라, 객체 생성 시의 초기 작동을 처리하기도 한다
	}
	
	// 각 필드에 대한 getter/setter를 작성 (Source - Generate Getters and Setters)
	public String getName() {	// 단어와 단어의 합성인 경우, 연결되는 단어의 첫글자를 대문자로 
		return name;			// getName : camelCase
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}

class Handler {	// 프로그램의 데이터 저장소 + 프로그램의 기능을 정의하는 클래스
	// Student를 저장할 수 있는 길이 10짜리 배열을 멤버 필드로 선언
	private static Student[] arr = new Student[10];
	private static Scanner sc = new Scanner(System.in);
	
	// 학생 데이터를 입출력할 수 있는 제어 부분 메서드
	static void start() {
		int menu = 0;
//		Scanner sc = new Scanner(System.in);
		
		// while, switch ~ case : 추가(빈칸이 없으면 추가할 수 없다는 메시지), 전체출력(개수만큼만)
		SYSTEM: do {
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 전체 출력");
			System.out.println("0. 종료");
			System.out.print("번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
				case 0: break SYSTEM;
				case 1: addStudent(); break;
				case 2: listAll(); break;
			}
		} while(menu != 0);
		
		System.out.println("시스템을 종료합니다.");
	}
	
	private static void addStudent() {	// 내부에서만 호출할 목적으로 작성만 메서드
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		Student st = new Student(name, kor, eng, mat);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = st;
				System.out.println("추가 성공!!");
				return;	// 반복문 내에서도 return은 즉각적인 함수의 종료를 의미한다
			}
		}
		System.out.println("빈 칸이 없습니다.");
	}
	private static void listAll() {
		System.out.println("##################################");
//		for(int i = 0; i < arr.length; i++) {
//			Student st = arr[i];
//			if(st != null) {
//				System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %.2f\n", 
//						st.getName(), st.getKor(), st.getEng(), st.getMat(), 
//						st.getSum(), st.getAvg());
//			}
//		}
		// arr 안에 있는 각각의 멤버 변수 중 하나를 st라고 할 때
		for(Student st : arr) {	// for(개별멤버변수 : 순환가능한 자료형)
			if(st != null) {
				System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %.2f\n", 
						st.getName(), st.getKor(), st.getEng(), st.getMat(), 
						st.getSum(), st.getAvg());
			}
		}
		System.out.println("##################################");
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// Handler 클래스의 인스턴스를 생성하고 start() 메서드 호출
		Handler handler = new Handler();
		handler.start();
	}
}
