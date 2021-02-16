package day05;

import java.io.File;
import java.util.Scanner;

public class Ex03_FileScan {
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Windows\\System32\\drivers\\etc";	// 파일의 폴더 경로
		String fileName = "hosts";									// 파일의 이름
		
		File f = new File(filePath, fileName);
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			Thread.sleep(500);
		}
		System.out.println("===끝===");
		sc.close();
	}
}
