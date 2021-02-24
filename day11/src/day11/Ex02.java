package day11;

public class Ex02 {
	public static void main(String[] args) {
		
		int length = 5;
		
		int[][] arr = new int[length][];	
		// int 배열을 저장할 수 있으나, 아직은 배열을 생성하지 않았다 
		
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		// .연산자 : ~의, 소유격 조사와 비슷한 역할, 내부 멤버를 참조하는 연산자
		// arr[i]의 길이를 요청, arr[i]가 null이면 대상이 없으므로, 대상의 길이를 구할 수 없다
		// 여친의 나이를 물어보면, 여친이 없어서 나이를 알 수 없다......
	}
}
