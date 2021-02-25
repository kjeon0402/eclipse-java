package day10;

import java.io.File;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		String fileName1 = "한국배우목록.txt";
		String fileName2 = "전국편의점목록.txt";
		
		File f = new File(fileName2);
		System.out.println("파일이 존재합니까 : " + f.exists());
		Scanner sc = new Scanner(f);
		String[] arr = new String[41018];
		
		int i = 0;
		while(sc.hasNextLine() ) {
			String line = sc.nextLine();			// 한 줄의 내용을 문자열로 저장한다
			String[] innerArr = line.split("\t");	// 탭 문자를 기준으로 분리하여, 배열의 형태로 반환해라
			String data = innerArr[0] + "(" + innerArr[1] + ")";
			arr[i] = data;
			i++;
		}
		
		for(i = 0; i < arr.length; i++ ) {
			System.out.printf("%4d : %s\n", i, arr[i]);
		}
		
//		while(sc.hasNextLine()) {
//			arr[i] = sc.nextLine();		// 한 줄마다 있는 배우 이름을 arr의 i번째에 담는다
//			i++;
//		}
						
		long startTime = System.currentTimeMillis();
		// 한국배우목록에 있는 배우의 이름은 오름차순으로 정렬하세요(선택정렬)
		for(i = 0; i < arr.length - 1; i++) {
			for(int k = i + 1; k < arr.length; k++) {
				if(Ex02.compare(arr[i], arr[k]) == 1) {
					String tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		double elapsedTime = (endTime - startTime) / 1000.0;
		System.out.printf("정렬에 걸린 시간 : %.2f초\n ", elapsedTime);
		sc.close();
	}
}
