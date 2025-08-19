package ch06;

public class Calculator {
	
	//리턴값 없는 메소드 선언
	void powrOn() {
		System.out.println("전원 on");
	}

	//리턴값 없는 메소드 선언
	void powerOff() {
		System.out.println("전원 off");
	}
	
	//호출 시 두 정수를 매개값으로 받고 int 리턴
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//호출 시 두 정수를 매개값으로 받고 double 리턴
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
}
