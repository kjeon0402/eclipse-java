package day13;

import java.io.File;
import java.net.Socket;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		
		String filePath = "C:\\windows\\system32\\drivers\\etc\\hosts";
		
		Scanner sc1 = new Scanner(System.in);
		// 표준입력으로 들어오는 데이터(키보드 입력)를 변수에 저장할 수 있다
		
		Scanner sc2 = new Scanner("Hello");
		// 문자열에서 데이터를 읽어내는 스캐너
		
		Scanner sc3 = new Scanner(new File(filePath));
		// 지정한 파일에서 데이터를 읽어내는 스캐너
		
		Scanner sc4 = new Scanner((Readable)new Socket("127.0.0.1", 80));
		// 지정한 네트워크 상의 컴퓨터 소켓에서 넘어오는 데이터를 읽어내는 스캐너
		
		// 내가 만든 클래스가 여러 유형의 데이터를 처리할 수 있는, 유연한 클래스가 된다
		// 만들기는 번거롭지만, 만들어두면 사용하는 사람은 편리하다
	}
}
