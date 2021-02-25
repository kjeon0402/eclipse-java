package day10;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	
	static String[] mergeSort(String[] arr) {
		if(arr.length < 2) return arr;
		
		int mid = arr.length / 2;
		String[] low_arr = mergeSort(Arrays.copyOfRange(arr, 0, mid));		
		// 0번부터 중간값까지 잘라낸다
		String[] high_arr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		// 0번부터 중간값까지 잘라낸다
		
		String[] mergedArr = new String[arr.length];	// 다시 합쳐질 배열
		int m = 0, l = 0, h = 0;
		while(l < low_arr.length && h < high_arr.length) {
			if(Ex02.compare(low_arr[l], high_arr[h]) == -1) 	// 앞의 값이 작으면 앞의 값을 넣는다
					mergedArr[m++] = low_arr[l++];
			else
				mergedArr[m++] = high_arr[h++];					// 뒤의 값이 작으면 뒤의 값을 넣는다
		}
		// 둘 중 하나를 넣고 나서 나머지 값을 뒤에 추가한다
		while(l < low_arr.length)		mergedArr[m++] = low_arr[l++];
		while(h < high_arr.length)		mergedArr[m++] = high_arr[h++];
					
		return mergedArr;
	}
	
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
		// 한국배우목록에 있는 배우의 이름은 오름차순으로 정렬하세요(병합정렬)
		arr = mergeSort(arr);
		
		
		
		long endTime = System.currentTimeMillis();
		double elapsedTime = (endTime - startTime) / 1000.0;
		System.out.printf("정렬에 걸린 시간 : %.2f초\n ", elapsedTime);
		sc.close();
	}
}
