package chapter02.operator;

public class C016_Operator3 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10;
		int num2 = 20;
		
		// and 연산자 (두 논리값이 모두 true일 경우 => true)
		boolean flag = (num1 > 0) && (num2 >0);
		System.out.println(flag);

		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		// or 연산자 ( 하나라도 true일 경우 => true)
		flag = (num1 < 0) || (num2 > 0 );
		System.out.println(flag);
		
		// not 부정연산자
		System.out.println(!flag);
		System.out.println("===========================");
		
		// and, or 연산자의 특징
		int num = 10;
		int i = 2;
		
		boolean value = ((num += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num);
		// i 는 4가 나와야 하니만 앞의 조건문이 false이면 결과는 false이기 때문에 뒷 조건문은 계산하지 않는다
		System.out.println(i);
		
		num = 10;
		i = 2;
		value = ((num += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num);
		// i 는 4가 나와야 하니만 앞의 조건문이 true이면 결과는 true이기 때문에 뒷 조건문은 계산하지 않는다
		System.out.println(i);
		
		
		
		
		
		
	}

}
