package chapter01.data;

public class C010_ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적(자동) 형변환 (작 => 큰)
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum +iNum2;
		System.out.println(dNum);
		
		
		
		
		

	}

}
