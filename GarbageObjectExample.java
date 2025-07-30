package ch05;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;	//kind2가 kind1을 참조하고 있어 "자동차" 유지
		System.out.println("kind2 : " + kind2);
	}

}
