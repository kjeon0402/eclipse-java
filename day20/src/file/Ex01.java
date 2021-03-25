package file;

import java.io.File;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 자바에서는 파일도 객체취급한다
		// 파일은 폴더와 데이터 파일의 형태를 모두 포함한다. 폴더(=디렉토리)도  파일이다
		// 자바의 파일 객체는 실제 위치에 파일이 존재하는지, 존재하지 않는지에 상관없이 객체 생성이 가능하다
		
		File dir = new File("C:\\fileTest");	// File(String pathName)
		File f1 = new File("a.txt");			// File(String pathName)
		File f2 = new File("C:\\windows\\system32\\drivers\\etc", "hosts");	// File(String parent, String child)
		File f3 = new File(dir, "test1.txt");	// File(File parent, String child)
		File f4 = new File("/etc/passwd");		// 리눅스와 맥은 경로 구분자로 /를 사용한다
												// 윈도우는 경로 구분자로 \를 사용한다
		
		System.out.println("dir.exist() : " + dir.exists());
		System.out.println("f1.exist() : " + f1.exists());
		System.out.println("f2.exist() : " + f2.exists());
		System.out.println("f3.exist() : " + f3.exists());
		System.out.println();
		
		boolean mkdir = dir.mkdir();			// 지정한 경로에 디렉토리(폴더)를 생성한다	생성 여부를 boolean으로 반환
		boolean newFile = f1.createNewFile();	// 지정한 경로에 파일을 생성한다			생성 여부를 boolean으로 반환
		
		System.out.println("dir디렉토리가 생성되었는가 : " + mkdir);
		System.out.println("f1이 생성되었는가 : " + newFile);
		
		System.out.println("dir.isDirectory() : " + dir.isDirectory());
		System.out.println("f1.isFile() : " + f1.isFile());
		
		// f1은 생성 당시 부모 경로를 별도로 작성하지 않았기 때문에 현재 위치를 기준으로 하는 [상대경로]가 적용된다
		// dir은 생성 당시 전체경로를 작성했기 때문에, [절대경로]가 적용된다
		
		System.out.println(dir.getAbsolutePath());
		System.out.println(dir.getPath());
		System.out.println(f1.getAbsolutePath());	// 절대경로로 요청하면 파일의 구체적인 위치를 반환
		System.out.println(f1.getPath());			// 경로만 요청하면 상대경로가 문자열로 반환
		
		String dirPath = "C:\\windows\\system32\\drivers\\etc";
		File dir2 = new File(dirPath);
		
		if(dir2.exists() && dir.isDirectory()) {	// 존재하는 디렉토리이면
			String[] files = dir2.list();			// 디렌토리 내부의 파일이름을 배열로 반환해서
			System.out.println("=== " + dir2.getPath() + " ===");
			for(String fileName : files) {			// 각각의 파일 이름을
				System.out.println(fileName);		// 화면에 출력한다
			}
			System.out.println("총 파일 개수 : " + files.length);
		}
	}
}
