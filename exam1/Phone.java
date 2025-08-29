package ch07.exam1;

public class Phone {
	//필드 선언
	public String model;
	public String color;
	
	//메소드 선언
	public void bell() {
		System.out.println("벨이 울림");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("통화 종료");
	}

}
