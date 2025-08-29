package ch07.exam1;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭", "검은색");
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		System.out.println();
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		System.out.println();
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.sendVoice("반갑습니다");
		myPhone.hangUp();
		System.out.println();
		
		//SmartPhone메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
