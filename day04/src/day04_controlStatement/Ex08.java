package day04_controlStatement;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		 String answer;
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("yes or no : ");
		 answer = sc.next();
		 
		 // 자바의 switch ~ case는 String을 처리할 수 있다
		 // A.equals(B)를 안써도 문자열 비교가 가능
		 switch(answer) {
		 case "yes" : System.out.println("네"); break;
		 case "no" : System.out.println("아니오"); break;
		 }
		 sc.close();
	}
}
