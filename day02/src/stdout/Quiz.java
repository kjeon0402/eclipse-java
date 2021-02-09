package stdout;

public class Quiz {
	public static void main(String[] args) {
		// System.out.prinf를 사용하여
		// 2021년 2월 달력을 화면에 출력하세요
		// 요일과 날짜가 간격이 맞추어져야 합니다
		// \t
		
		// 일   월   화   수   목   금   토
		//    1 2
		
		System.out.printf(" 일   월   화    수    목    금    토\n");
		System.out.printf("    1  2  3  4  5  6\n");
		System.out.printf(" 7  8  9 10 11 12 13\n");
		System.out.printf("14 15 16 17 18 19 20\n");
		System.out.printf("21 22 23 24 25 26 27\n");
		System.out.printf("28\n");
		System.out.println();
		
		String format = "%3d\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n";
		int date = 1;
		System.out.printf("\t\t%10d년 %d월\n", 2021, 2);
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","SUN","MON","TUE","WED","THU","FRI","SAT");
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n","",date++,date++,date++,date++,date++,date++);
		System.out.printf(format,7,8,9,10,11,12,13);
		System.out.printf(format,14,15,16,17,18,19,20);
		System.out.printf(format,21,22,23,24,25,26,27);
		System.out.printf("%3d\n",28);
	}
}
