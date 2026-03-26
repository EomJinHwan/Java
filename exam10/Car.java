package ch08.exam10;

public class Car {
	// 필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	// 메서드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
