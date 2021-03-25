package day19;

import java.util.ArrayList;
import java.util.Scanner;

class Timer1 extends Thread {
	// 10초의 시간을 카운트다운하여 0이되면 종료되는 메서드 count()
	private int time = 10;
	private boolean running;	// 초기값을 부여하지 않으면 false
	
	public void count() throws Exception{
		running = true;
		for(int i = time; i >= 0; i--) {
			System.out.println("남은시간 : " + i);
			Thread.sleep(1000);	// Thread 클래스의 static 메서드, millisecond단위로 CPU에게 대기하도록 한다
		}
		running = false;
	}
	
	public boolean isRunning() {	// boolean의 getter는 getRunning이 아니라 isRunning이 된다
		return running;
	}
	
	@Override			// 오버라이딩은 예외처리 형태도 슈퍼클래스에 정의된 형식에 따라야 한다
	public void run() {	// 멀티 스레드로 구동할 코드의 내용을 작성
		try {
			count();
		} catch (Exception e) {}
	}
}

public class Quiz1 {
	
	public static void main(String[] args) throws Exception{
		Timer1 ob = new Timer1();
//		ob.count();
		ob.start();
		
		// 10초의 시간 안에 문자열을 반복하여 입력받고, 입력이 끝나면 리스트에 입력된 문자열을 한줄씩 출력하도록 작성
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// 타이머가 종료되면, 반복을 중단한다
		boolean flag = true;
		
		while(flag) {
			System.out.print("영단어 입력 : ");
			list.add(sc.next());	// sc로 입력받은 문자열을 list에 추가한다
			flag = ob.isRunning();
		}
		
		// 리스트의 문자열을 반복문으로 한줄씩 출력
		for(String str : list) {
			System.out.println(str);
		}
		sc.close();
	}
}
