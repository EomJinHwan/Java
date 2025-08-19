package ch06;

public class CalculatorExample1 {

	public static void main(String[] args) {
		//객체 생성
		Calculator1 Cal = new Calculator1();
		
		//정사각형 넓이 구하기
		double result1 = Cal.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = Cal.areaRectangle(10, 20);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

	}

}
