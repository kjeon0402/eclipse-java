package struct;

public class Ex02 {
	public static void main(String[] args) {
		
		// 자바에서는 같은 패키지 내의 다른 클래스를 조건 없이 불러올 수 있다
		Human data1 = new Human();	// String name과 int age를 저장할 수 있지만, 값은 비어있다
		
		System.out.println(data1.name);
		System.out.println(data1.age);
		
		// Human클래스를 이용하여 서로 다른 3명의 데이터를 만들고 화면에 출력하세요
		data1.name = "suzy";
		data1.age = 27;
		
		Human data2 = new Human();
		data2.name = "taehee";
		data2.age = 29;
		
		Human data3 = new Human();	// Human자료형의 데이터가 3개 있다. 같은 자료형의 데이터를 묶으려면? 배열
		data3.name = "iu";
		data3.age = 29;
		
		System.out.printf("%s\t: %d살\n%s\t: %d살\n%s\t: %d살", data1.name, data1.age, data2.name, data2.age, data3.name,
				data3.age);
	}
}
