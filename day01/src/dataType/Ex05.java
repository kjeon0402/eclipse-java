package dataType;

public class Ex05 {
	public static void main(String[] args) {
		// Wrapper Class
		// 각각의 기본 자료형에 대응되는 클래스 자료형이다
		// 기본 자료형의 데이터를 저장할 수 있다
		// 기본 자료형끼리는 어느정도 형변환이 가능하지만, Class끼리는 직접 형변환이 되지 않는다
		
		boolean bo1 = true;
		byte by1 = 10;
		short sh1 = 20;
		char ch1 = 70;
		int n1 = 100;
		long ln1 = 1000L;
		float fl1 = 1.2F;
		double db1 = 3.14;
		
		Boolean bo2 = bo1;
		Byte by2 = by1;
		Short sh2 = sh1;
		Character ch2 = ch1;
		Integer n2 = n1;
		Long ln2 = ln1;
		Float fl2 = fl1;
		Double db2 = db1;
		
//		int num = "1234";
		int num = Integer.parseInt("1234"); 	
		// Wrapper Class의 기능을 활용하여 문자열을 정수로 변환
		System.out.println(num + 1);
		
		by1 = (byte)n1;	// 기본 자료형끼리는 간단한 형변환이 가능하지만
//		by2 = (Byte)n2;	// Wrapper클래스는 자신과 대응되는 기본자료형에만 변환이 가능하다
		
//		char name[20] = "이지은";
		String name = "이지은";
		System.out.println(name);
	}
}
