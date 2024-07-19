package chapter03.condition;

import java.util.Scanner;

public class If_Example06 {

	public static void main(String[] args) {
		// BMI 계산하기
		// BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산한다
		// 이 계산 결과에 따라 다음과 같이 판단된다
		// - 저체중 :  18.5 미만
		// - 정상 : 18.5 이상, 23 미만
		// - 과체중 : 23이상 25미만
		// - 비만 : 25이상
		// 키 (cm), 몸무게를 입력받아 BMI를 계산하시오
		
		// 출력 결과
		// 키 : 188.5
		// 몸무게 : 75.3
		// BMI지수 : 21.19201570404351 (정상)

		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("키 : ");
		double hight = sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
//		double hight = 188.5;
//		double weight = 75.3;
		
		// 계산
		hight /= 100;
//		System.out.println(hight);
		
		double bmi = weight / (hight * hight);
//		System.out.println(bmi);
		
		String grade = "저체중";
		if (bmi >= 18.5 && bmi < 23) {
			grade = "정상";
		} else if (bmi >= 23 && bmi < 25) {
			grade = "과체중";
		} else if (bmi >= 25) {
			grade = "비만";
		}
		
		
		// 출력
		System.out.println("BMI지수 : " + bmi + " (" + grade + ")");
		
		
		
		
		
		
		
		
		
	}

}
