package stdin;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// 스캐너로 문자열 입력 받기
		String test1, test2;
		
		System.out.print("띄워쓰기 포함된 한 줄을 입력 : ");
		test1 = sc.nextLine();
		
		System.out.print("띄워쓰기나 엔터가 있으면 그 전의 내용만 입력 : ");
		test2 = sc.next();
		
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);
		
		byte by = sc.nextByte();			// 정수만 처리함
		boolean bo = sc.nextBoolean();		// true/false만 처리
		short sh = sc.nextShort();			// 정수만 처리함
		char ch = sc.next().charAt(0);	// 문자열의 0번째 글자만 가져온다
		int num = sc.nextInt();
		long ln = sc.nextLong();
		float fl = sc.nextFloat();
		double db = sc.nextDouble();
		
		// sc.next()는 엔터를 신경쓰지 않고 받을 수 있다. 그러나 띄워쓰기가 입력되지 않음
		// sc.nextLine()은 엔터까지 입력받으니까, 버퍼에 엔터가 남으면 입력을 못한다. 그러나 띄워쓰기 가능
		
		// 모든 입력마다, sc.nextLine()으로만 처리하면 버퍼에 엔터가 남은 상황을 방지할 수 있다
		// 정수는 Integer.parseInt(sc.nextLine())
		// 실수는 Double.parseDouble(sc.nextLine())
		// 이런 형식으로 입력받아도 된다
		System.out.println(by);
		System.out.println(bo);
		System.out.println(sh);
		System.out.println(ch);
		System.out.println(num);
		System.out.println(ln);
		System.out.println(fl);
		System.out.println(db);
		
		sc.close();
	}
}
