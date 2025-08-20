package ch06;

public class Car6 {
	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	Car6(String model){
		this.model = model;	//this 생략 불가
	}

	//메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;	//this 생략 불가
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "이 달리는 중 시속 : " + this.speed + "km/h"); //this 생략 가
	}
	
}
