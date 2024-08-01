package chapter07.array;

public class C060_enhancedForLoop1 {

	public static void main(String[] args) {
		// 강화된 for 문 / foreach문
		int[] score =  {88, 94, 72, 75, 23};
		int sum = 0;
		for (int s : score) {	// 데이터 타입이 일치 해야하고, 처음부터 끝까지 돌기 때문에 인덱스를 적을 필요x
			sum += s;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double) sum / score.length);
		
		// foreach문은 읽기 전용 반복문
		int[] score2 =  {88, 94, 72, 75, 23};
		// int s != score2[0] , score2[1]
		for (int s : score2) {
			s++;
			System.out.println(s + " ");
			score2[0] = 90;
		}
		System.out.println(score2[0]);
		
		
	}

}
