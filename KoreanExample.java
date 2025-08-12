package ch06;

public class KoreanExample {
	public static void main(String[] args) {
		//Korean 객체 생성
		Korean kor = new Korean("자바", "000000-1234567");
		//객체 데이터 읽기
		System.out.println("kor.nation : " + kor.nation);
		System.out.println("kor.name : " + kor.name);
		System.out.println("kor.ssn : " + kor.ssn);
	}

}
