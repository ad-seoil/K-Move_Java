package chapter07.array;

public class C057_array4 {

	public static void main(String[] args) {
		int[] score = {88, 94, 74, 75, 23};
		
		// 총 합계
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총 합계 : " + sum);
		double avg = 0;
		avg += score[0];
		avg += score[1];
		avg += score[2];
		avg += score[3];
		avg += score[4];
		System.out.println("총합 : " + (int)avg);
		
		// 평균
		avg /= score.length;
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + (double)sum/score.length);
	}

}
