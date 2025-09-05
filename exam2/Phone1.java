package ch07.exam2;

public class Phone1 {
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public Phone1(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}

}
