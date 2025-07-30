package ch05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "990814-1231234";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
