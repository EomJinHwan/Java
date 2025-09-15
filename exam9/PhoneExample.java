package ch07.exam9;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();	//추상 클래스는 객체 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("진환");
		
		smartPhone.turnOn();	//Phone.java의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();	//Phone.java의 메소드

	}

}
