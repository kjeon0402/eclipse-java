package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		// 텍스트 파일 읽어서 프로그래멩 데이터 가져와서 출력하기
		
		String pathName = "C:\\windows\\system32\\drivers\\etc";
		String fileName = "hosts";
		
		File f = new File(pathName, fileName);
		Scanner sc = new Scanner(f);		// 파일 객체를 대상으로 하는 Scanner 객체
		
		while(sc.hasNextLine()) {			// it.hasNext() or enu.hasMoreElements()
			String data = sc.nextLine();	// it.next() or enu.nextElements()
			System.out.println(data);
		}
		sc.close();
		
		Runtime.getRuntime().exec("notepad " + f.getAbsolutePath());
	}
}
