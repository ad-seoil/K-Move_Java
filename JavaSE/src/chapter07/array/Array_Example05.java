package chapter07.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Example05 {

	public static void main(String[] args) {
		// 로또 만들기
		

		// 행운번호의 개수 입력(행)
		Scanner scan = new Scanner(System.in);
		System.out.print("받을 행운번호의 갯수를 입력해주세요 : ");
		int size = scan.nextInt();
		
		System.out.println("==================================");
		
		// another
//		int cnt = 1;
//		while(cnt <= size) {
//			int[] lotto = new int[6];
//			System.out.print("행운번호 [" + cnt + "] : ");
//			
//			// 난수 6개 배열에 저장
//			for (int i = 0; i < lotto.length; i++) {
//				lotto[i] = (int)(Math.random() * 45 + 1);
//				
//				// 중복제거
//				for (int j = 0; j < i; j++) {
//					if (lotto[i] == lotto[j]) {
//						i--;
//						break;
//					}
//				}
//			}
//			
//			// 정렬
//			for (int i = 0; i < lotto.length; i++) {
//				for (int j = i + 1; j < lotto.length; j++) {
//					if (lotto[i] > lotto[j]) {
//						int temp = lotto[j];
//						lotto[j] = lotto[i];
//						lotto[i] = temp;
//					}
//				}
//			}
			
//			Arrays.sort(lotto);	// 정렬해 주는 메서드
		
//		
//			// 문자열 포맷팅
//			// %d(정수), %s(문자열), %f(실수)
//			for (int i = 0; i < lotto.length; i++) {
//				System.out.printf("%3d", lotto[i]); // %3d = 3자리수까지 정수를 입력
//			}
//			cnt++;
//			
//		}
		
// =================================================
		
		
		// 난수 생성
		Random r = new Random(); // 난수를 뽑을 랜덤
		// 배열을 입력받은 수만큼 생성
		for (int i = 0; i < size; i++) {
			// 배열의 사이즈는 6으로 고정
			int[] arr = new int[6];
			System.out.print("오늘의 행운번호[" + (i+1) + "] : ");
			// 배열을 처음부터 끝까지 돌려서 난수 생성
			for (int j = 0; j < 6; j++) {
				arr[j] = r.nextInt(45)+1;
				// 중복처리
				// 생성된 배열의 수가 이전의 배열값이랑 같으면 안됨
				// 생성된 인덱스 이전의 것 값을 전부 불러서 확인해야함
				// if문이 아니라 반복문을 써서 배열값을 불러내고 값을 확인해야할거 같은데
				// 그러면 반복문은 while문을 써야하나 for문을 써야하나
				
				// j값 이전까지 반복을 돌림
				for (int k = 0; k < j; k++) {
					// 만약 그 이전의 인덱스랑 값이 같다면 다시 난수를 할당
					// 근데 이러면 값이 바뀌고 나서 그 전의 값이랑 같을때 걸러낼수가 없음
					if (arr[k] == arr[j]) {	// 여기서 걸리면 j도 처음부터 다시 돌려야함
						j--;	// j을 값을 하나빼고 이부분만 중복안되게 반복
						break;
					}
				}
			}
			// 중복이 없는 배열을 만듬
			// 여기서부터 정렬 (선택 정렬)
			
			// 만들어진 배열을 처음부터 돌림
			for (int j = 0; j < arr.length; j++) {
				// 최소 인덱스 설정
				int minIdx = j;
				// 최소 인덱스 다음부터 반복
				for (int k = j+1; k < arr.length; k++) {
					// 최소 인덱스의 값보다 작다면
					if (arr[k] < arr[minIdx]) {
						// 최소인덱스를 바꿈
						minIdx = k;
					}
				}
				// 값을 서로 교환함
				int temp = arr[j];
				arr[j] = arr[minIdx];
				arr[minIdx] = temp;
			}
			
			// 정렬된 배열 출력
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
	}

}
