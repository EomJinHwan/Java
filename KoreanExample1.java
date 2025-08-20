package ch06;

public class KoreanExample1 {

	public static void main(String[] args) {
		//객체 생성시 매개값 전달
		Korean1 Kor = new Korean1("123456-1234567", "자바");
		
		//필드값 읽기
		System.out.println(Kor.nation);
		System.out.println(Kor.ssn);
		System.out.println(Kor.name);
		
		//Final 필드 값 변경 불가
		//Kor.nation = "USA";
		//Kor.ssn = "987654-1234567";
		
		//FInal 필드 아니면 변경 가능
		Kor.name = "김";
		
		System.out.println(Kor.name);

	}

}
