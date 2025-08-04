package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		
		System.out.println("season[0] = " + season[0]);
		System.out.println("season[1] = " + season[1]);
		System.out.println("season[2] = " + season[2]);
		System.out.println("season[3] = " + season[3]);
		System.out.println();
		
		//값 변경
		season[1] = "여름";
		System.out.println("season[1] = " + season[1]);
		System.out.println();
		
		//벼열 변수 선언과 배열 생성
		int[] scores = { 85, 90, 88 };
		
		//총합 평균 구하기
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 = " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 = " + avg);

	}

}
