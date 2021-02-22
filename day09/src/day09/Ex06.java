package day09;

public class Ex06 {
	// void는 아무 값도 반환하지 않는 함수에 대한 자료형(return을 작성하지 않아도 된다)
	static void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d%s", arr[i], i == arr.length - 1 ? "\n" : ", ");
		}
	}
	
	public static void main(String[] args) {
		// 반복문이 예제코드일 경우, 반복 횟수를 모두 손으로 작성하면서 따라가면서 이해하세요
		int[] arr = { 2, 7, 4, 8, 6 };
		showArr(arr);
		
		// 선택정렬 코드
		for(int i = 0; i < arr.length - 1; i++) {	// 0부터 3까지	
			for(int j = i + 1; j < arr.length; j++) {	// i부터 4까지
				boolean flag = arr[i] > arr[j];
				System.out.printf("%d, %d, %b\n", arr[i], arr[j], flag);
				
				if(flag) {	// 만약, i번재 숫자가 j번째 숫자보다 더 크면
					int tmp = arr[i];	// 두 수를 교환(swap)
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		showArr(arr);
		
		// 정렬 : 값의 크기나 다른 기준에 의해 순서댈 배치하는 작업
		// 자리 바꾸기 : 두 개의 변수에 담긴 값을 서로 교환하려면 임시 변수가 하나 더 필요하다(swap)
		// a와 b의 값을 swap해보자
		int a = 10, b = 20;
		System.out.printf("a : %d, b : %d", a, b);
		int tmp = a; 
		a = b;
		b = tmp;
		System.out.printf("a : %d, b : %d", a, b);
	}
}
