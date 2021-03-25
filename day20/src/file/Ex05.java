package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		// 파일에 문자열 기록하기 (Reader : 읽기, Writer : 쓰기, 2바이트 크기의 글자를 전송할 수 있는 클래스)
		
		File f = new File("a.txt");
		if(f.exists() == false)
			f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);					// 파일을 대상으로 하는 출력 스트림
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");	// 문자열을 기록하는 Writer
		BufferedWriter bw = new BufferedWriter(osw, 1024);
		
		bw.write("Hello, world!!\n");
		bw.write("안녕하세요!");
		bw.write("\r\n");
		bw.write("작성일자 : " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		bw.flush();		// 버퍼를 비운다(버퍼에 있는 데이터를 스트림의 대상으로 밀어낸다)
						// 만약 flush하기 전에 버퍼가 꽉 차면 자동으로 flush하는 형식이 있는데, 이를 autoFlush라고 한다
		bw.close();
		System.out.println("실행 완료!!");
		
		Runtime.getRuntime().exec("notepad " + f.getAbsolutePath());
	}
}
