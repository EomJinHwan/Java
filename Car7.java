package ch06;

public class Car7 {
	//인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언
	void run() {
		System.out.println("현재 속도 : " + speed);
	}
	
	static void simulate() {
		//객체 생성
		Car7 Car = new Car7();
		//인스턴스 멤버 사용
		Car.speed = 200;
		Car.run();
	}
	
	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car7 Car = new Car7();
		//인스턴스 멤버 사용
		Car.speed = 60;
		Car.run();
	}

}
