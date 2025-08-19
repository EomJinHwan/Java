package ch06;

public class Car5 {
	//필드 선언
	int gas;
	
	//리턴값 없는 메소드로 매개값 받아서 gas 필드값 변경
	void setGas(int gas) {
		this.gas = gas;
		
	}
	
	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false, 아니면 true 리턴
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false; //false 리턴 후 메소드 종료
		}
		System.out.println("gas가 있습니다");
		return true; //true 리턴 후 메소드 종료
	}
	
	//리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드 종료
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.print("동작");
				System.out.println("gas 잔여량 : " + gas );
				gas -= 1;
			} else {
				System.out.print("정지");
				System.out.println("gas 잔여량 : " + gas);
				
				return;
			}
		}
	}

}
