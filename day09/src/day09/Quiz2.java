package day09;

public class Quiz2 {
	// 자바 배열을 저장하는 변수는 참조변수이다. 클래스에 의해 생성된 객체와 마찬가지
	public static void main(String[] args) {
		// 1) int형 배열 arr 길이를 5로 지정하여 생성하세요
		int[] arr = new int[5];
		
		// 2) arr에 순서대로 2, 5, 7, 3, 6의 값을 입력하세요
//		arr = new int[]{ 2, 5, 7, 3, 6 };
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 7;
		arr[3] = 3;
		arr[4] = 6;
		
		// 3) arr의 멤버 변수의 모든 값을 합산하여 int num에 저장하고 출력하세요
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
//		int num = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		System.out.println(sum);
		
		// 4) arr와 똑같은 내용을 가지는 arr2를 새로 생성하세요
//		int[] arr2 = arr;	// arr2 참조변수도 arr와 같은 대상을 바라보게 하자(복사가 아님)
//		int[] arr2 = arr.clone();	// 같은 객체를 새로 복사하는 자바의 기능(매서드)
		int[] arr2 = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];		// 내용을 복사해야 다른 배열이 된다
		}
		
		// 5) arr2의 모든 멤버 변수에 2를 곱하세요
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr2[i] * 2;
		}
//		arr2[0] = arr2[0] * 2;
//		arr2[1] = arr2[1] * 2;
//		arr2[2] = arr2[2] * 2;
//		arr2[3] = arr2[3] * 2;
//		arr2[4] = arr2[4] * 2;
		
		// 6) arr와 arr2의 내용을 각각 한 줄에 출력하세요
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int num : arr2) {	// arr2에 있는 각 멤버변수 하나하나를 num이라고 할 때
			System.out.printf("%2d ", num);
		}
		// index를 사용하지 않고 모든 멤버 요소에 접근 가능한 반복문

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
	}
	
}
