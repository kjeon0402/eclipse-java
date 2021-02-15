package day04_controlStatement;

public class Ex01 {
	public static void main(String[] args) {
		// 제어문 : 상태(조건)에 따라 코드의 흐름을 제어하는 구문
		
		// 성적에 따라서 평점을 출력하는 코드가 있다면, 평균점수에 의해 A ~ F 사이의 평점을 출력하기 위해 조건을 판단해야 한다
		
		int num1 = 20;
		
		// 괄호 안에 들어간느 조건이 참(true)이면, 아래의 코드를 수행한다 {} 
		// C언어 혹은 파이썬과는 달리, boolean 자료형의 값만 조건으로 처리할 수 있다
		if(num1 < 20) {
			System.out.println(++num1);
		} else {	// if에서 처리하지 못한 경우를 모두 처리하는 제어문
//		if(num1 >= 20) {
			System.out.println(--num1);
		}
	}
}
