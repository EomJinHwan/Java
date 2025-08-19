package ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//Calculator 객체 생성
		Calculator Cal = new Calculator();
		
		//리턴 값 없는 powerOn() 메소드 호출
		Cal.powrOn();
		
		//plus 메소드로 덧셈 
		int result1 = Cal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		
		//divide() 메소드 호출시 변수 x와 y의 값을 매개값으로 제공
		
		double result2 = Cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		//리턴 값 없는 powrOff() 메소드 호출
		Cal.powerOff();

	}

}
