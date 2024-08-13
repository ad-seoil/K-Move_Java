package chapter13.collection;

import java.util.HashSet;
import java.util.Iterator;

public class C107_collection_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> kangwon = new HashSet<>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시");
		
		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
