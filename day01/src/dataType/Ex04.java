package dataType;

public class Ex04 {
	public static void main(String[] args) {
		
		int n1;
		byte b1;
		
		b1 = 15;
		n1 = b1;	// 1byte의 데이터를 4byte 크기의 변수(그릇)에 옮겨담는 과정 (실제로는 복사되어서 전달)
		System.out.println(n1);
		
		int n2;
		byte b2;	// -128 ~ +127
		
		n2 = 17;
		b2 = (byte)n2;	// 4byte에 담긴 데이터를 1byte 크기의 그릇에 옮겨담는 과정
						// 데이터가 잘려나갈 수도 있다
						// Type mismatch: cannot convert from int to byte
		
		System.out.println(b2);
		
		int n3;
		byte b3;
		
		n3 = 200;
		b3 = (byte)n3;	// 1byte의 그릇으로 담을 수 없는 내용을 강제로 담았기 때문에 데이터의 손실이 발생
		System.out.println(b3);
		
	}
}
