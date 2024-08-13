package chapter13.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C111_collection_treeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "부산");
		treeMap.put(2, "인천");
		treeMap.put(3, "대구");
		treeMap.put(4, "대전");
		treeMap.put(5, "광주");
		treeMap.put(6, "울산");
		
		// 저장된 총 Entry 수 얻기
		int size = treeMap.size();
		System.out.println(size);
		
		// 객체 찾기
		Object object = treeMap.get(1);
		System.out.println(object);
		
		// key를 요소로 가지는 Set 생성
		Set<Integer> keySet = treeMap.keySet();
		System.out.println(keySet);
		
		// value 값 읽기
		Iterator<Integer> keyIt = keySet.iterator();
		while (keyIt.hasNext()) {
			Integer key = keyIt.next();
			String value = treeMap.get(key);
			System.out.println("키 : " + key + ", 값 : " + value);
		}
		
		// 객체 삭제 후 크기 출력
		treeMap.remove(1);
		System.out.println(treeMap.size());
		
		// entrySet() 을 활용한 value 값 읽기
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
	}

}
