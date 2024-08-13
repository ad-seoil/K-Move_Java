package chapter13.collection;

import java.util.HashMap;

public class C109_collection_hashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 1000);
		snack.put("빼빼로", 1200);
		
		String mySnack = "죠리퐁";
		System.out.println(mySnack + "의 가격은 " + snack.get(mySnack));

	}

}
