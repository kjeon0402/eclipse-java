package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("이지은", "010-1234-5678"));
		list.add(new Member("홍진호", "010-2222-2222"));
		list.add(new Member("강지언", "010-8744-7777"));
		
		fileWrite(list);
		System.out.println("Ex06 실행!!");
	}

	static void fileWrite(ArrayList<Member> list) throws IOException{
		String fileName = "phoneBookList.txt";
		File f = new File(fileName);
		if(f.exists() == false)
			f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
				
		for(Member m : list) {
			System.out.println(m);
			osw.write(m.toString() + "\r\n");
		}
		osw.write("\r\n" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		// java.util.Date : 자바에서 날자 정보를 처리할 수 있는 클래스
		// java.text.SimpleDateFormat : 날짜 형식을 문자열 형태로 지정할 수 있는 클래스
		
		osw.flush();
		osw.close();
		
		Runtime.getRuntime().exec("notepad " + f.getAbsolutePath());
	}
}
