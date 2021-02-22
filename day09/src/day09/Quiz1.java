package day09;

public class Quiz1 {
	// 아래 solution 함수를 완성하세요
	static String solution(int a, int b) {
		int day = 0;
		String[] weekOfDay = { "TUR", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		//               0   1   2   3   4   5   6   7   8   9   10  11
		int[] cntDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for(int i = 0; i < a - 1; i++) {
			day = day + cntDay[i];
		}
		day = day + b;
	
		String result = weekOfDay[day % 7];
		
		return result;
	}
	
	public static void main(String[] args) {
		// 프로그래머스 2016년 문제
		// 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일인가요?
		// 두 수 a, b를 입력 받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수 solution을 완성하세요
		// 요일은 SUN, MON, TUE, WED, THU, FRI, SAT
		// 2016년은 윤년입니다(2/29일까지 있습니다)
		// a월 b일은 실제로 있는 날입니다(범위를 벗어나는 날짜는 제시되지 않습니다)
		
		System.out.println(solution(5,24).equals("TUE"));
		System.out.println(solution(5,16).equals("MON"));
		System.out.println(solution(12,25).equals("SUN"));
		System.out.println(solution(2,1));
	}
}
