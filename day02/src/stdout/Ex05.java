package stdout;

public class Ex05 {
	public static void main(String[] args) {
		
		// Escape Sequence (특수 문자, 출력에 사용되지만 글자로 출력되는 형태는 아니다)
		
		System.out.print("1");		// 자동 줄바꿈 기능이 없다
		System.out.print("2");
		System.out.print("3");
		
		System.out.print("1\n");	// \n : New Line, 커서를 다음 줄로 이동시킨다
		System.out.print("2\n");	
		System.out.print("3\n");
		
		System.out.print("1\t");
		System.out.print("2\t");
		System.out.print("3\t");
		System.out.println();
		
		// 이스케이프 시퀀스는 모두 한글자로 간주한다
		char newLine = '\n';		 	// 커서를 아랫줄로 이동한다			
		char crriageReturn = '\r';		// 커서를 현재 줄에서 가장 왼쪽으로 이동한다
		char tab = '\t';				// 커서를 탭 크기(4 or 8)만큼 오른쪽으로 이동한다
		char backSpace = '\b';			// 커서를 왼쪽으로 한 칸 이동시킨다
		
		System.out.printf("nl : %d\n", (int)newLine);
		System.out.printf("cr : %d\n", (int)crriageReturn);
		System.out.printf("tab : %d\n", (int)tab);
		System.out.printf("bs : %d\n", (int)backSpace);
		System.out.println();
		
		System.out.println("AAA\nBBB");
		System.out.println("AAA\rBBB");
		System.out.println("AAA\tBBB");
		System.out.println("AAA\bBBB");
		
		String test = "AAA\r\n" + 
				"BBB";
		System.out.println(test);
		
		String profile = "이름 : \t이지은\n나이 : \t29\n주소 : \t서울\n이메일 : \tiu@itbank.com";
		System.out.println(profile);
		
		// 문자열에 쌍따옴표를 출력할 수 있는가?		자바는 쌍따옴표로 문자열의 시장과 끝을 나타낸다
		// 문자열에 백슬래시(\)를 출력할 수 있는가?	자바는 \뒤에 알파벳을 적어서 이스케이프 시퀀스를 나타낸다
		// prinf() 함수로 %를 출력할 수 있는가?	prinf는 % 뒤에 알파벳을 적어서 서식문자를 나타낸다
		
		// 자신만의 고유 기능이 있는 글자, 단순히 출력만 하려면 어떻게 해야하나?
		
		System.out.println("강사님이 말했다. \"지금부터 쉬는 시간입니다!\"라고.");		// \ : 뒤에 오는 특수문자의 기능을 제거해주는 기능
		System.out.println("/ : 슬래시, \\ : 백슬래시");
		System.out.printf("출석율 100%%!!\n");		// prinf에서 %를 출력하기 위해 %를 2개 쓰면 된다
		
//		<input type="text" name="userid">  HTML에서의 활용
		String input = "<input type=\"text\" name=\"userid\">";
		System.out.println(input);
	}
}
