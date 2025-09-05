package ch07.exam2;

public class SmartPhoneExample1 {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone1 phone = new SmartPhone1("갤럭시", "검은색");
		
		//Phone으로부터 상속받은 필드 열기
		System.out.println("모델 : " + phone.model);
		System.out.println("색상 : " + phone.color);

	}

}
