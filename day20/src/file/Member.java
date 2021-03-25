package file;

import java.io.Serializable;

public class Member implements Serializable {	// 인터페이스를 구현해도 오버라이딩을 하지 않는다
	
	private static final long serialVersionUID = 2606227695371634150L;
	
	private String name, phoneNumber;
	
	public Member(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return String.format("[%s] : %s", name, phoneNumber);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
