package stdout;

public class Quiz2 {
	public static void main(String[] args) {
		String name;
		double avg;
		int kor, eng, mat, sum = 0;
		// 변수를 선언할 때, 자료형이 같은 변수는 한 줄에 여러 개 선언할 수 있다. 개별적으로 초기화도 가능
		// 주석 아래에서 이름, 국어, 영어, 수학 과목의 점수를 대입하고
		// 합계와 평균을 구한 이후에
		// 각 변수의 값을 한 줄씩 출력합니다
		
		// 각 과목의 점수와 합계는 3자리의 공간을 확보한 후 출력
		// 평균은 소수점 둘째자리까지만 출력
		// 정수로 나누어 떨어지지 않는 평균이라면 소수점 이하자리 모두 출력, 아니면 .00으로 출력
		// 이름 : ooo
		// 국어 : nn
		// 영어 : nnn
		// 수학 : nn
		// 합계 : nnn
		// 평균 : nn.nn
		
		name = "강지언";
		kor = 96;
		eng = 95;
		mat = 86;
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("국어 : %3d\n", kor);
		System.out.printf("영어 : %3d\n", eng);
		System.out.printf("수학 : %3d\n", mat);
		System.out.printf("합계 : %3d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		
	}
}
