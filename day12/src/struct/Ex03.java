package struct;

// 변수 -> 배열 -> 구조체(자료형) -> 구주체 배열

public class Ex03 {
	public static void main(String[] args) {
		
		Human[] arr = new Human[] { null, null, null };
		// 배열에 초기값을 할당하지 않으면, 자료형에 맞게 0에 대응되는 초기값으로 초기화한다
		// 정수 : 0, 실수 : 0.0, 논리 : false, 대문자로 시작하는 자료형 or 배열 : null
		
		arr[0] = new Human();
		
		arr[0].name = "이지은";
		arr[0].age = 29;
		
		for(int i = 0; arr[i] != null && i < arr.length; i++) {
			// { human, null, null }
			System.out.printf("이름 : %s, 나이 : %d\n", arr[i].name, arr[i].age);
		}
	}
}
