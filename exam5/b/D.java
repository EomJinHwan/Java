package ch07.exam5.b;	//A.java 와 다른 패키지

import ch07.exam5.a.A;

public class D extends A{	//A.java를 상속 받음
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();	//가능
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value";
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {	//객체 직접 생성해서 사용은 불가
		A a = new A();
		a.field = "value";
		a.method();
	}

}
