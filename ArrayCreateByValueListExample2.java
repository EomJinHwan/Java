package ch05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {80, 90, 70};
		
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		printItem(new int[] {60, 50, 40});

	}
	
	public static void printItem (int[] scores) {
		for(int i = 0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i] );
		}
	}

}
