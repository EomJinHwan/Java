package ch05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9908141231234";
		int length = ssn.length();
		
		if(length == 13){
			System.out.println("자릿수가 맞습니다");
		} else {
			System.out.println("자릿수가 틀립니다");
		}

	}

}
