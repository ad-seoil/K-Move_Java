package chapter12.generic;

import java.util.ArrayList;
import java.util.List;

interface Readable {}
interface Closeable {}

class BoxType implements Readable, Closeable {}
class BoxType2 implements Readable {}
// 다중타입 한정 ( &  사용 )
class Box<T extends Readable & Closeable> {
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}

public class C100_generic_range2 {

	public static void main(String[] args) {
		Box<BoxType> box = new Box<>();
//		Box<BoxType2> box2 = new Box<>();
//		Box<Object> box3 = new Box();

		
		
	}

}
