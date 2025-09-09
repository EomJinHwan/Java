package ch07.exam5.b;	//A.java 와 다른 패키지

import ch07.exam5.a.A;

public class C {
	//메소드 선언
	public void method() {
		A a = new A();	//불가능
		a.field = "value";	//불가능	
		a.method();	//불가능
	}

}
