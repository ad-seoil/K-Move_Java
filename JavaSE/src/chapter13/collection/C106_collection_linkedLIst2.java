package chapter13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C106_collection_linkedLIst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arName = new ArrayList<>();
		arName.add("장보고");
		arName.add("김유신");
		arName.add("강감찬");
		arName.add("을지문덕");
		
		for (String s : arName) {
			System.out.print(s + " ");
		}

		System.out.println();
		// 정렬
		Collections.sort(arName);
		// 역순정렬
		Collections.reverse(arName);
		// 무작위
		Collections.shuffle(arName);
		
		for (String s : arName) {
			System.out.print(s + " ");
		}
		
	}

}
