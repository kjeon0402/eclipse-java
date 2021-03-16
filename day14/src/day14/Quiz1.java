package day14;

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

class RC {
	TV target;		// 객체를 생성하지 않고, 외부에서 전달받은 tv의 주소를 저장해두기 위한 필드
	TV modelNameInsert;
	TV powerButton;
	TV channelUp;
	TV channelDown;
	TV volumeUp;
	TV volumeDown;
	TV muteVolume;
	TV channelInsert;
	TV show;
	
	void setTV(TV arg) {
		target = arg;
	}
	
	void modelNameInsert() {
		if(target != null) {
			target.modelNameInsert();
			target.show();
		} else System.out.println("대상이 지정되지 않았습니다.");
	}
	
	void turnOnOff() {
		if(target != null) {
			target.powerButton();
			target.show();
		}
	}
	
	void volumeUp() {
		if(target != null) {
			target.volumeUp();
			target.show();
		}
	}
	
	void volumeDown() {
		if(target != null) {
			target.volumeDown();
			target.show();
		}
	}
	
	void channelUp() {
		if(target != null) {
			target.channelUp();
			target.show();
		}
	}
	
	void channelDown() {
		if(target != null) {
			target.channelDown();
			target.show();
		}
	}
	
	void muteVolume() {
		if(target != null) {
			target.muteVolume();
			target.show();
		}
	}
	
	void channelInsert() {
		if(target != null) {
			target.channelInsert();
			target.show();
		}
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		TV tv = new TV();			// TV객체를 생성
		RC rc = new RC();			// RC객체를 생성
		
		rc.setTV(tv);
		
		rc.modelNameInsert();
		rc.turnOnOff();
		
		rc.channelInsert();
		rc.channelUp();
		rc.channelDown();
		
		rc.volumeUp();
		rc.volumeDown();
		
		rc.muteVolume();
		rc.muteVolume();
		
		rc.turnOnOff();
		
		// 외부의 값을 객체 내부로 전달하는 대표적인 2가지 방법
		// 1) [생성자] 매개변수로 전달하는 방법 -> 참조할 대상이 없으면 객체를 생성할 수 없다
		// 2) 객체가 생성된 후 [메서드]를 이용하여 값을 전달하는 방법
		// 3) 객체의 [멤버필드]에 직접 값을 대입하는 방법(자주 사용하지 않는다)
	}
}
