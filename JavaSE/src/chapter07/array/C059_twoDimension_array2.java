package chapter07.array;

public class C059_twoDimension_array2 {

	public static void main(String[] args) {
		int[][] score = {
				{77, 56, 79, 82},	// 1번 학생
				{99, 96, 89, 88},	// 2번 학생
				{81, 69, 62, 80}	// 3번 학생
		};
		
		// 학생별 총점, 평균을 출력하고 학급의 전체 평균을 출력
		int resultSum = 0;	// 학급 총점
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;	// 학생 총점
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}	// 2차 배열 for문 종료
			resultSum += sum;
			System.out.println(i+1 + "번 학생의 총점 : " + sum + "점, 평균 : " + (double)sum/score[i].length + "");
		}	// 1차 배열 for문 종료
		System.out.println("전체 평균 : " + (double)resultSum / (score.length * score[0].length));

	}

}
