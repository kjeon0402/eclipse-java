package tv;

import java.util.Scanner;

class TV {
	// 속성은 변수로(명사형) : 전원, 채널, 볼륨, 음소거 상태. TV모델명...
	boolean power;	// 전원은 on/off 두 가지만 있으니까 boolean으로 처리했음
	int channel = 2;	// 멤버필드는 직접 초기화하지 않으면, 자료형에 맞는 초기값으로 자동으로 초기화된다
	int volume = 5;
//	boolean mute;
	int mute;
	String modelName;
	
	// 기능은 함수로(동사형)
	// 전원 버튼
	void powerButton() {
		power = !power;
	}
	
	// 채널 입력(이하의 기능들은 전원이 on인 상태에서만 작동하도록 해보자)
	void channelInsert() {
		if(power) {
			System.out.print("이동할 채널 번호 입력 : ");
			Scanner sc = new Scanner(System.in);
			channel = sc.nextInt();
			if(channel < 2 && channel > 13) {
				System.out.println("입력한 번호로 지정된 채널이 없음");
			}
		}
	}
	
	// 채널 업
	void channelUp() {	// 2번에서 13번 사이 범위만 작동, 로테이션으로 돌 수 있는 형식으로
		if(power) {
			channel = channel + 1;
			if(channel > 13) channel = 2;
		}
	}
	
	// 채널 다운
	void channelDown() {
		if(power) {
			channel = channel - 1;
			if(channel < 2) channel = 13;
		}
	}
	
	// 볼륨 업
	void volumeUp() {	// 최대 10, 더이상 올라가지 않음
		if(power) {
			volume = volume + 1;
			if(volume > 10) volume = 10;
		}
	}
	
	// 볼륨 다운
	void volumeDown() {	// 최소 0, 더이상 내려가지 않음
		if(power) {
			volume = volume - 1;
			if(volume < 0) volume = 0;
		}
	}
	
	// 음소거 버튼 : 현재 볼륨이 0으로 변경되고, 한 번 더 누르면 원래 볼륨으로 돌아온다
	void muteVolume() {
		if(power) {
//			mute = !mute;
			int tmp = volume;
			volume = mute;
			mute = tmp;
		}
	}
	
	// 모델명 입력
	void modelNameInsert() {
		System.out.print("모델명을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		modelName = sc.nextLine();
	}
	
	void show() {
		System.out.println("현재 TV의 전원 : " + (power ? "켜짐" : "꺼짐"));
		if(power) {
			System.out.println("현재 채널 : " + channel);
			System.out.println("현재 볼륨 : " + volume);
		}
		System.out.println("모델명 : " + modelName);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 자바에서 객체를 생성할 때는, [클래스] [변수이름] = new [클래스]();
		TV tv1 = new TV(); 	// TV를 만든다
//		tv1.show();			// 상태를 확인한다
//		tv1.powerButton();	// 전원 버튼을 누른다
//		tv1.show();			// 상태를 확인한다
//		tv1.powerButton();	// 전원 버튼을 누른다
//		tv1.show();			// 상태를 확인한다
		tv1.show();
		tv1.modelNameInsert();
		tv1.powerButton();
		tv1.channelInsert();
		tv1.volumeUp();
		tv1.muteVolume();
		tv1.show();
	}
}
