package ch07.exam4;

public class Car {
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {
		System.out.println("멈춤");
		speed = 0;
	}

}
