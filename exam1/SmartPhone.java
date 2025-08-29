package ch07.exam1;

public class SmartPhone extends Phone {
	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}

	public void internet() {
		System.out.println("인터넷 연결");
	}
}
