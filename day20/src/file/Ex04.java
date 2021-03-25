package file;

//import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		String pathName = "C:\\windows\\system32\\drivers\\etc";
		String fileName = "hosts";
		
		File f = new File(pathName, fileName);				// 파일
		FileInputStream fis = new FileInputStream(f);		// 파일을 입력받는 스트림
		InputStreamReader isr = new InputStreamReader(fis);	// Reader : 문자열 처리 객체
//		BufferedReader br = new BufferedReader(isr);		// 버퍼단위로 읽을 수 있는 객체
				
		char[] buf = new char[1024];		// 버퍼의 크기가 클수록 한 번에 옮기는 데이터의 양이 증가한다
											// 버퍼의 크기가 크면 클수록 함수 호출의 횟수가 줄어든다
				
		System.out.println("=== InputStreamReader로 파일 내용을 불러와서 출력하기 ===\n");
		while((isr.read(buf)) != -1) {		// -1은 end of file
			System.out.println(buf);		// InputStream에서 파일을 read했을 때, 데이터가 없으면 -1
//			pw.println(buf);
		}
		isr.close();
	}
}
