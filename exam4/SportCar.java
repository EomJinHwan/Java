package ch07.exam4;

public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {	//오버라이드 불가
		System.out.println("스포차가를 멈춤");
		speed = 0;
	}
	

}
