package day10;

public class Ex06 {
	static void showArr(int[] arr) {
		System.out.print("arr : ");
		for(int i = 0; i < arr.length; i++) {
			boolean flag = i == arr.length - 1;
			System.out.printf("%d%s", arr[i], flag ? "\n" : ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30 };
		System.out.println("arr의 길이 : " + arr.length);
		showArr(arr);
		
//		arr[3] = 40;	// 배열길이 - 1이 접근 가능한 마지막 인덱스
		System.out.println(arr);
		
		int[] tmp = new int[arr.length + 3];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];	// 대입은 우변의 값을 좌변의 공간에 복사하여 할당하는 과정이다
		}
		arr = tmp;	// arr가 tmp의 대상을 똑같이 바라보게(참조하게) 한다
		showArr(arr);
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		showArr(arr);
		System.out.println(arr);
	}
	
	// 배열 자료형은 primitive가 아닌 reference타입의 자료형이며,
	// 변수는 참조변수이므로, 대상을 가리키는 형태가 된다
	// 대상을 가리키는 참조변수는 초기값으로 null(가리키는 대상이 없음)을 할당한다
	
	// 배열은 길이가 고정이다. 한 번 선언된 배열은 길이를 변경할 수 없다
	
	// 배열을 가리키는 참조변수의 대상을 바꿀 수는 있다
	// 기존 배열에서 보다 큰 크기의 배열을 새로 만들어서 
	// 기존 배열에서 신규 배열로 데이터를 복사하고,
	// 기존 배열을 가리키던 참조변수가 신규배열을 가리키게 하면
	// 마치 배열의 길이가 늘어난 것과 같은 효과를 볼 수 있다
}
