package ch06;

public class ComputerExample {

	public static void main(String[] args) {
		//Computer 객체 생성
		Computer Com = new Computer();
		
		//sum() 메소드 호출 시 매개값 1, 2, 3 제공
		int result1 = Com.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		//매개값 1,2,3,4,5 제공
		int result2 = Com.sum(1,2,3,4,5);
		System.out.println("result2 : " + result2);
		
		//배열 제공
		int[] vaules = {1, 2, 3, 4, 5};
		int result3 = Com.sum(vaules);
		System.out.println("result3 : " + result3);
		
		int result4 = Com.sum(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);

	}

}
