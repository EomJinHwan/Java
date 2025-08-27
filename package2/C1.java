package ch06.package2;	//A1.java와 다른 패키지

import ch06.package1.A1;

public class C1 {
	
	//필드 선언
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);	//default 생성자 접근 불가
	A1 a3 = new A1("문자열");	//private 생성자 접근 불가

}
