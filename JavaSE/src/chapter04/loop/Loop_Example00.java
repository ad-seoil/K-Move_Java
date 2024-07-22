package chapter04.loop;

public class Loop_Example00 {

	public static void main(String[] args) {
		// 1~100까지의 정수 중 홀수의 합을 구하시오
		
		int sum = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= 100; i += 2) {
//			System.out.println(i);
			sum += i;
		}
		System.out.println("홀수의 합 (1~100) : " + sum);

		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				sum2 += i;
//				System.out.println(i);
			}
		}
		System.out.println("홀수의 합 (1~100) : " + sum2);
		
		int num3 = 1;
		int sum3 = 0;
		while(num3 <= 100) {
			sum3 += num3;
			num3 += 2;
		}
		System.out.println(sum3);
		
		
		int num4 = 1;
		int sum4 = 0;
		do {
			sum4 += num4;
			num4 += 2;
		} while (num4 <= 100);
		System.out.println(sum4);
		
		
//		int cnt = 1;
//		while (true) {
//			System.out.println(cnt + "번 폭주기관차가 나가신다!!칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭");
//			cnt++;
//		}
		
	}

}
