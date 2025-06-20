package ch02;

public class VariableInitializationExample {

	public static void main(String[] args) {
		//변수 선언
		int value; //
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//변수 result 값을 출력
		System.out.println(result);	//위에 int value = @; 식으로 변수 초기화시 오류 해결
	}
}
