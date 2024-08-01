package chapter07.array;

public class C058_twoDimension_array1 {

	public static void main(String[] args) {
		int[][] score = {
				{77, 56, 79, 82},	// A
				{99, 96, 89, 88},	// B
				{81, 69, 62, 80}	// C
		};
		System.out.println(score.length);
		System.out.println(score[0].length);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 학생의 성적 : ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
