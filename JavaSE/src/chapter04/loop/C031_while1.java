package chapter04.loop;

public class C031_while1 {

	public static void main(String[] args) {
		// while
		int filesize = 720;
		int download = 0;
		
		while(download < filesize) {
			download += 120;
			System.out.println(download + "k 다운로드 중...");
		}
		System.out.println("다운로드 완료");
		
//		int cnt = 0;
//		while (true) {
//			cnt++;
//			if (cnt == 100000000) {
//				break;
//			}
//			System.out.println(cnt + "호 폭주기관차 나가신다! 칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭칙칙폭폭");
//			
//		}
	}

}
