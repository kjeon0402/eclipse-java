package day10;

public class Quiz1 {
	static void showData(String[] nameArr, int[] ageArr) {
		for(int i = 0; i < 5; i++) {
			System.out.printf("%s\t: %d살\n", nameArr[i], ageArr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] nameArr = { "원빈", "현빈", "박현빈", "전혜빈", "김우빈" };
		int[] ageArr = { 43, 38, 38, 37, 31 };
		
		System.out.println("=== 정렬 전 ===");
		showData(nameArr, ageArr);
		
		// 1) 5명의 정보를 이름을 기준으로 오름차순 정렬하세요		
		
		for(int i = 0; i < nameArr.length - 1; i++) {		// 기준을 선정하는 i번째
			for(int j = i + 1; j < nameArr.length; j++) {	// 대상을 선정하는 j번째 
				if(Ex02.compare(nameArr[i], nameArr[j]) == 1) {
					String tmp = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = tmp;
					int age = ageArr[i];
					ageArr[i] = ageArr[j];
					ageArr[j] = age;
				}	
			}
		}
		
		System.out.println("=== 정렬 후 ===");
		showData(nameArr, ageArr);
		
		// 2) 5명의 정보를 나이를 기준으로 오름차순 정렬하세요
		for(int i = 0; i < ageArr.length - 1; i++) {
			for(int j = i + 1; j < ageArr.length; j++) {
				if(ageArr[i] > ageArr[j]) {
					int tmp = ageArr[i];
					ageArr[i] = ageArr[j];
					ageArr[j] = tmp;
					String name = nameArr[i];
					nameArr[i] = nameArr[j];
					nameArr[j] = name;
				}
			}
		}
		
		System.out.println("=== 정렬 후 ===");
		showData(nameArr, ageArr);
	}
}
