package chapter13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C102_collection_arrayList {

	public static void main(String[] args) {
		// List <= ArrayList
		List<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list.add(1);
		list.add(2);
//		list.add("ddd");
		list.add(3);
		list.add(2, 5);	// index 2번에 5를 추가
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		list.remove(0);	// index 0번 값 제
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		// index 1 값 리턴
		System.out.println("get(index) : " + list.get(1));
		// list의 사이즈 리턴
		System.out.println("size() : " + list.size());
		
		
		
		
		
	}

}
