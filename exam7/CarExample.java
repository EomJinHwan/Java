package ch07.exam7;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		
		//Tire 객체 장착
		car.tire = new Tire();
		car.run();
		
		//Hankooktire 객체 장착
		car.tire = new Hankooktire();
		car.run();
		
		//KumhoTire 객체 장착
		car.tire = new KumhoTire();
		car.run();
	}

}
