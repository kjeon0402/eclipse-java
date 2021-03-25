package day19;

import java.lang.Thread;	// 자바에서 동시 다중 작업을 처리할 수 있는 클래스

class Test1 extends Thread {	// 자바의 Thread클래스가 가지는 속성과 기능을 그대로 물려받았다
	
	@Override
	public void run() {			// Thread에서 정의되어 있으며, start()로 호출하면 run()의 내용을 다중스레드로 처리한다
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {	// main 함수가 먼저 시작
		
		Test1 ob = new Test1();
//		ob.run();				// 알파벳을 순서대로 출력(함수 호출이 종료되면 다음 코드를 진행)
		ob.start();				// 작성은 run()에 하지만, 호출은 start()로 호출해야 한다
		
		for(int i = 0; i < 25; i++) {
			System.out.print(i + " ");
		}
	}
}
