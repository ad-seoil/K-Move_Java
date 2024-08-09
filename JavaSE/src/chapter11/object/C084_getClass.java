package chapter11.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C084_getClass {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		
		System.out.println(kim);
		Class cls = kim.getClass();
		System.out.println(cls);
		
		Class cls2;
		try {
			cls2 = Class.forName("chapter11.object.Human");
			System.out.println("클래스 이름 = " + cls2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// 클래스의 이름을 반환
		System.out.println(kim.getClass().getName());
		System.out.println("클래스 이름 = " + cls.getName());
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());
		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.print(field.getName() + " ");
		}
		System.out.println();
		System.out.print("메서드 : ");
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + " ");
		}
		
		

	}

}
