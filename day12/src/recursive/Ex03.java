package recursive;

public class Ex03 {
	
	static void fibo(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		while(c <= num) {
			System.out.printf("%d ", c);
			c = a + b;
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		
		// 피보나치 수열
		// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
		// 0 + 1 = 1
		// 1 + 1 = 2
		// 1 + 2 = 3
		// 2 + 3 = 5
		// ...
		
		fibo(1000);
	}
}
