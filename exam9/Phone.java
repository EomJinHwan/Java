package ch07.exam9;

public abstract class Phone {
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("전원 켜짐");
	}
	void turnOff() {
		System.out.println("전원 꺼짐");
	}

}
