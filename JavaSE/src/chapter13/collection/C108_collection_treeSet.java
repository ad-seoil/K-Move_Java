package chapter13.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class C108_collection_treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		ts.add(4);
		ts.add(2);
		
		Iterator<Integer> it = ts.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		// TreeSet 이용한 로또
		TreeSet<Integer> lotto = new TreeSet<>();
		for (; lotto.size() < 6;) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		System.out.println();
		for (Integer i : lotto) {
			System.out.print(i + " ");
		}
		
		
	}

}
