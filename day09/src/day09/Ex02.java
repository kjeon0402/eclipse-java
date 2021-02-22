package day09;

public class Ex02 {
	public static void main(String[] args) {
		
		// 배열은 같은 자료형의 여러 데이터를 묶어서 관리한다
		// 배열에는 순번이 존재하고, 길이가 자체적으로 내장되어 있다(int)
		
		// 배열 선언하는 방법
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int arr2[] = { 11, 22, 33, 44, 55 };
		int[] arr3 = new int[5];	// 값은 지정하지 않고, 길이만 지정하여 배열을 선언한다
		int[] arr4 = new int[] { 12, 23, 34, 45, 56 };
									// 길이를 지정하지 않으면, 값을 넣어줘야 한다
//		int[] arr5 = new int[5] { 1, 2, 3, 4, 5 };
									// 값과 길이를 동시에 명시하면 배열을 만들 수 없다
		
		System.out.println(arr1[0]);	// 배열의 멤버에 접근하려면 순번을 명시하면 된다
		System.out.println(arr1[1]);	// 배열의 멤버 변수는 일반 변수와 동일하게 취급한다
		System.out.println(arr1[2]);	// 순번이 1씩 증가하면서 출력하기 때문에 for문으로 가능
		System.out.println(arr1[3]);	// 배열의 순번은 항상 0부터 시작한다
		System.out.println(arr1[4]);	// 배열의 마지막 순번은 항상 (길이 - 1)이다
		
		System.out.println("arr1의 길이 : " + arr1.length);
		// 자바의 모든 배열은 자체적으로 길이 정보를 저장하고 있따
		// 배열은 길이를 변경할 수 없다(길이 이상의 데이터를 저장할 수 없으며, 길이는 선언 시에 결정된다)
		
		arr1[0] = 1;	// 일반 번수와 동일하게 취급하므로, 값을 대입할 수 있따
		arr1[0] += 2;	// 연산도 가능
		System.out.println(arr1[0]);	// 출력도 가능
		
//		arr1.length = 7;	// The final field array.length cannot be assigned
		
		// 변수는 초기화하지 않으면, 사용할 수 없다.
		// 배열의 멤버 변수는 초기화하지 않으면, 자료형에 맞는 값으로 자동으로 초기화된다
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		// boolean : false
		// 정수 : 0
		// 실수 : 0.0
		// 클래스 : null
	}
}
