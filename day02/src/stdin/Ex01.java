package stdin;

// 클래스는 자료형이다
import java.io.*;	// java.io라는 패키지 내부에 있는 모든 클래스를 참조할 수 있도록 선언한다
// 컴퓨터의 입력은 키보드에서 컴퓨터 내부로 곧장 이어지지 않고
// [버퍼]라고 하는 입력 대기열이 존재한다
// a를 누르고 엔터를 누르면
// 버퍼에는 순서대로 'a', '\r', '\n'이 들어가서 대기하게 된다
// 자바에서 입력함수를 호출하면 버퍼에서 함수가 처리할 수 있는 크기만큼만 가져간다
// 나머지는 버퍼에 그대로 남아있다

public class Ex01 {
	public static void main(String[] args) throws Exception {		// 모든 예외를 전가시킨다
		
		System.out.print("글자를 하나 입력하세요 : ");
		int num = System.in.read();		// 1byte의 입력을 받아서 keyCode를 정수로 반환하는 기능
		System.out.println("입력 받은 글자 : " + num);		// 아스키코드 출력
		System.out.println("입력 받은 글자 : " + (char)num);	
		
		// 1바이트 입력이 끝난 후, 엔터의 값을 제거하기 위해 값을 저장하지는 않지만, 버퍼에 있는 글자를 가져와야 한다
		System.in.read();
		System.in.read();
		
		InputStreamReader ins = new InputStreamReader(System.in);	// Reader : 글자를 읽어낸다
		// System.in을 이용하여 2byte로 입력받을 수 있는 객체를 생성
		
		System.out.println("한글을 한 글자 입력 : ");
		int num2 = ins.read();
		System.out.println("입력받은 글자 : " + num2);
		System.out.println("입력받은 글자 : " + (char)num2);
		
		// 단일 글자를 모아서 문자열의 형태로 입력받을 수 있는 객체를 생성한다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름을 입력하세요 : ");
		String name = br.readLine();		// 엔터키값이 있을 때까지 그 이전의 값을 모두 가져온다
		System.out.println("입력받은 이름 : " + name);
		
		// Wrapper Class의 기능을 활용하여 기본자료형으로 입력을 받을 수 있다
		System.out.print("나이를 입력 : ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("입력받은 나이 : " + age);
		
		// java 1.5이전까지
		
		//  프로그램의 입장에서 사용자에게 데이터를 입력받는다는 일은 굉장히 위험부담을 가져가는 일이다
		// 프로그램이 원하는 자료형 혹은 형식대로 사용자가 입력한다는 보장도 없으며
		// 표현범위를 벗어나는 데이터를 입력할 수도 있다
		// 따라서, 여러가지 발생할 수 있는 예외 상황을 처리해야 하지만
		// 자바기초에서 후반에 배우는 Exception에 대해 공부한 후 예외를 직접 처리하기로 하고
		// 지금은 모든 예외 상황을 적절하게 처리하는 코드는 생략
		
		// 사용자 입력 데이터도 기본 단위는 1byte부터 시작
	}
}
