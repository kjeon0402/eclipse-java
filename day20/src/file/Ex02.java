package file;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String dirPath = "C:\\자바 한글 폴더";
		File dir = new File(dirPath);
		
		if(dir.exists() == false)	// 없으면
			dir.mkdir();			// 디렉토리를 생성해라
		
		File dir2 = new File(dirPath);
		System.out.println("dir2가 존재하는가 : " + dir2.exists());
		
		Runtime rt = Runtime.getRuntime();				// 런타임 불러오기	
		Process pro = rt.exec("explorer " + dirPath);	// 런타임으로 운영체제 명령어 전달
		
		Process notepad = rt.exec("notepad c:\\windows\\system32\\drivers\\etc\\hosts");
		Thread.sleep(3000);
		notepad.destroy();
		
		rt.exec("shutdown /s /t 600");	// 600초 후에 시스템을 종료
		rt.exec("shutdown /a");			// 예약된 시스템 종료를 취소한다
	}
}
