package exception;

import java.util.ArrayList;
import java.util.Scanner;

// 회원가입 : 기존과 중복되는 ID로 가입을 시도하는 경우
// 로그인 : 없는 ID를 입력했거나, 패스워드가 일치하지 앉는 경우

class Member {	// 속성 중심의 클래스
	private String userid, userpw, username;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
}

class MemberService {	// 기능 중심의 클래스
	private ArrayList<Member> list = new ArrayList<Member>();
	private Scanner sc = new Scanner(System.in);
	
	public void init() throws Exception {
		// join()를 호출한다고 가정했을 때, join은 callee(호출 당하는 입장), main은 caller(호출 하는 입장)
		// throws는 callee에서 예외가 발생하면, 예외처리를 caller에게 전가하는 문법
		int menu;
		while(true) { 
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("0. 종료");
			System.out.print("선택 >> ");
			menu = sc.nextInt();
			try {
				switch(menu) {
					case 1: join(); break;
					case 2: login(); break;
					case 0: System.out.println("프로그램 종료"); return;
				}				
			} catch(MemberServiceException e) {
				System.out.println(e.getClass().getSimpleName() + " : " + e);
			}
//			} catch(AlreadyExistUseridException e) {
//				System.out.println(e);	// e.toString()의 내용 입력
//			} catch(MemberNotFoundException e) {
//				System.out.println(e);
//			}
		}
	}	
	private void join() throws AlreadyExistUseridException {	// 예외를 caller에게 전가한다
		String userid, userpw, username;
		System.out.print("ID : ");			userid = sc.next();
		// 만약 입력받은 ID가 중복이면, 예외를 발생시킨다
		for(Member m : list) {
			if(userid.equals(m.getUserid())) {
				throw new AlreadyExistUseridException();
			}
		}
		
		System.out.print("Password : ");		userpw = sc.next();
		System.out.print("Your Name : ");		username = sc.next();
		
		Member m = new Member();
		m.setUserid(userid);
		m.setUserpw(userpw);
		m.setUsername(username);
		boolean flag = list.add(m);
		System.out.println(flag ? "가입성공" : "가입실패");
	}
	private void login() throws MemberNotFoundException {
		String userid, userpw;
		System.out.println("=== 로그인 ===");
		System.out.print("ID : ");			userid = sc.next();
		System.out.print("Password : ");		userpw = sc.next();
		
		for(Member m : list) {
			if(m.getUserid().equals(userid) && m.getUserpw().equals(userpw)) {
				System.out.println(m.getUsername() + "님 로그인 성공");
				return;
			}
		}
//		System.out.println("일치하는 계정을 찾을 수 없습니다.");
		throw new MemberNotFoundException();	// 예외를 발생시킨다
	}
}

class MemberServiceException extends Exception {
	
}

class AlreadyExistUseridException extends MemberServiceException {
	@Override
	public String toString() {
		return "중복된 ID입니다.";
	}
}

class MemberNotFoundException extends MemberServiceException {
	@Override
	public String toString() {
		return "일치하는 계정을 찾을 수 없습니다.";
		// ID가 잘못되었다 or PW가 잘못되었다라고 명시적으로 표현하지 않는다(보안 상의 문제)
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// try, catch, throw, throws, finally
		MemberService ms = new MemberService();
		try {
			ms.init();			
		} catch(Exception e) {
			System.out.println("MemberService 외의 기타 오류 발생 : " + e);
		}
	}
}
