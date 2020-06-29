package ioTest;

import java.io.Serializable;

public class Friend implements Serializable{//Friend라는 객체를 바이트로 내보내 주는 직렬화 과정
	private String name;
	private String birth;
	private String addr;
	private String tel;
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

	
	
}
