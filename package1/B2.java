package ch06.package1;	//A2.java 와 동일 패키지

public class B2 {
	public void method() {
		//객체 생성
		A2 a  new A2();
		
		//필드 값 변경
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;	//private 필드 접근 불가
		
		//메소드 호출
		a.method1();
		a.method2();
		a.method3();	//private 메소드 접근 불가
	}
	

}
