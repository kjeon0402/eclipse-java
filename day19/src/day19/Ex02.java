package day19;

// 슈퍼클래스를 상속받는 클래스를 Thread로 처리하려면
class MyTimer extends Timer2 implements Runnable{	// 다중스레드로 실행할 수 있는

	@Override
	public void run() {
		try {
			count(7);
		} catch (Exception e) {}
	}	
}

public class Ex02 {
	public static void main(String[] args) throws Exception {
//		Timer2 timer = new Timer2();
//		timer.count();
//		timer.count(3);
		
		MyTimer timer = new MyTimer();
		Thread th = new Thread(timer);	// Runnable을 생성자 매개변수로 전달
		th.start();
		
		// Runnable은 인터페이스이면서 추상메서드를 하나만 포함하는 형식이다
		// Lambda식 객체 생성이 가능하다!!
		
		Thread th2 = new Thread(() -> System.out.println("식사하러 가세요!"));
		th2.start();
		
		// 1) class *** implements Runnable
		// 2) Lambda식 인테페이스 객체 생성(함수형 인터페이스 : 추상메서드 하나만 포함하는 인터페이스)
		// 3) 인터페이스는 추상클래스이므로, 익명 내부 클래스 형식으로 객체 생성이 가능하다
	}
}
