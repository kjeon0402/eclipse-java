package day14;

class Test {
	private int pri = 1;	// private : 클래스 내부(class Test)에서의 접근만 허용하고, 외부의 접근은 허용하지 않는다
	int pac = 2;
	protected int pro = 3;
	public int pub = 4;
	
	public void showField() {	// method를 작성해서, 외부에서 접근을 내가 통제할 수 있지만
								// 외부에서 직접 값에 접근해서 임의로 변경하는 행위는 허용하지 않겠다
		
		pri = 7;				// private의 경우, 클래스 내부에서는 값에 접근할 수 있다
		System.out.println("pri : " + pri);
		System.out.println("pac : " + pac);
		System.out.println("pro : " + pro);
		System.out.println("pub : " + pub);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Test ob1 = new Test();	// 1, 2, 3, 4
		
//		ob1.pri = 5;	// The field Test.pri is not visible
		ob1.pac = 5;
		ob1.pro = 5;
		ob1.pub = 5;
		
		ob1.showField();		// 5, 5, 5, 5
		
		
		
		int n1 = 10;		// 자바는 순수한 객체 지향 프로그래밍 언어는 아니다.(primitive(기본 자료형)의 존재 때문에)
		Integer n2 = 20;
		
		// n1은 기본 자료형이므로 순수하게 데이터만 저장하며, 기능을 포함하지 않는다(객체가 아니라 단순 기본 자료형)
		
		n2.toString();
		// n2는 클래스 기반의 객체이며, [데이터]를 저장함과 동시에 수행할 수 있는 [기능]도 포함하고 있다
	}
}
