package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
				
		// 리스트를 만들어서 파일에 기록하기
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("이지은", "010-1234-5678"));
		list.add(new Member("홍진호", "010-2222-2222"));
		list.add(new Member("강지언", "010-8744-7777"));
		list.add(new Member("주호민", "010-6666-6666"));
		
		File f = new File("phonebook.dat");	// 확장자는 사실 크게 의미가 없다
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);		// Object 타입의 모든 객체를 파일로 전송(기록)할 수 있다.
									// 단, 기록하기 위해서는 전송되는 객체의 모든 구성요소가 직렬화 가능한 유형이어야 한다
									// 직렬화 : 파일에 기록하기 위해서 객체를 byte 단위로 분리하여 한 줄로 세우는 작업
		oos.flush();
		oos.close();
		
		// 파일에서 객체를 불러와서 원상태로 복구되는지 확인
		ArrayList<Member> list2 = null;
		File f2 = new File("phonebook.dat");
		FileInputStream fis = new FileInputStream(f2);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		list2 = (ArrayList<Member>) ois.readObject();	// 파일에서 불러온 객체
		System.out.println("파일에서 불러온 리스트 순환 출력");
		for(Member m : list2) {
			System.out.println(m);
		}		
		ois.close();
		
		// 스트림은 대상이 System일 수도 있고, File일 수도 있고, Network 상의 다른 Host, Process일 수도 있다
	}
}
