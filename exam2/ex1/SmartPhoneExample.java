package ch07.exam2.ex1;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone phone = new SmartPhone("갤럭시", "검은색");
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);
	}

}
