package day10;

public class Ex03 {
	public static void main(String[] args) {
		// 앞에서 작성한 함수를 활용하여 문자열을 정렬해보자
		
		String[] arr = { "강지언", "허용승", "윤재홍", "윤시원", "배국한", "이영화" };
		
		System.out.print("정렬 전 배열 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : ", "));
		}
		System.out.println();
		
		long startTime = System.currentTimeMillis();	// 현재 시간을 정수값으로 반환
		
		// 정렬 코드
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {	// 문자열은 연산자로 크기 비료를 할 수 없다
//				Ex02.compare(arr[i], arr[j]) == 1 : arr[i]가 크다, -1 : arr[j]가 크다, 0 : 같다
				if(Ex02.compare(arr[i], arr[j]) == 1) {	// 앞서 작성한 함수를 이용하여 크기 비교를 수행
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		double elapsedTime = endTime - startTime / 1000.0;
		System.out.println(elapsedTime);
		
		System.out.print("정렬 후 배열 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : ", "));
		}
	}
}
