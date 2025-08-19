package ch06;

public class CarExample5 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car5 Car = new Car5();
		
		//리턴 값이 없는 setGas() 메소드 호출
		Car.setGas(6);
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(Car.isLeftGas()) {
			System.out.println("출발");
			
			//리턴값이 없는 run() 메소드 호출
			Car.run();
		}
		
		System.out.println("gas를 주입하세요");

	}

}
