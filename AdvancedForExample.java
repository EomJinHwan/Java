package ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 90, 50, 70, 77 };
		
		int sum = 0;
		
		for (int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

	}

}
