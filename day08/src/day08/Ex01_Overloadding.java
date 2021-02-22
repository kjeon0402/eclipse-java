package day08;

public class Ex01_Overloadding {
	
	// overload : 과부하, 하나에 많은 요소가 연결되어 있는 형태
	
	// network에서의 overload : 하나의 IP에 여러 대의 컴퓨터가 연결되어 있는 형태(공유기, NAT)
	// 여러 대의 서로 다른 컴퓨터가 하나의 IP를 사용하려면, 각 컴퓨터를 구분할 수 있는 기준이 필요하다(Port)
	
	// Router(config)# ip nat inside source list 10 pool NAT overload
	
	// 자바에서 overload : 하나의 함수의 이름에 여러 함수 정의가 연결되어 있는 형태
	// 여러 개의 서로 다른 함수가 하나의 이름을 사용하려면, 각 함수를 구분할 수 있는 기준이 필요하다 (매개변수)
	// 매개변수의 자료형이 다르거나, 개수가 다르면 오버로딩을 할 수 있다(함수의 중복 선언)
	
	// int add(int n1, int n2)
	// int add(int n1, int n2, int n3)
	// int add(int[] arr)
	// double add (double d1, double d2)
	
	// 오버로딩이 없다면...? (함수의 이름이 중복되어서는 안된다 in C lang)
	static int addTwo(int n1, int n2) {
		return n1 + n2;
	}
	static int addThree(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	static double addTwoDouble(double d1, double d2) {
		return d1 + d2;
	}
	static int addArr(int[] arr) {
		int sum = 0;
		for(int i = 0; i <  arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	// 오버로딩 기능을 활용하면
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	static int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	static double add(double d1, double d2) {
		return d1 + d2;
	}
	static int add(int[] arr) {
		int sum = 0;
		for(int i = 0; i <  arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int v1 = addTwo(10, 20);
		int v2 = addThree(10, 20, 30);
		int v3 = addArr(new int[]{10,20,30,40,50});
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// 더하기를 하려면 add만 기억하세요
		int t1 = add(11,22);
		int t2 = add(2,3,4);
		double t3 = add(1.3, 2.4);
		int t4 = add(new int[] {3,4,5,6,7});
		
		System.out.printf("%d, %d, %.2f, %d\n",t1,t2,t3,t4);
	}
	
}
