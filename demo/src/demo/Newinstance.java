package demo;

import java.lang.reflect.Constructor;

public class Newinstance {

	public static void main(String[] args)
			throws Exception {
		Constructor<MyClass> constructor =MyClass.class.getConstructor();
		
		MyClass obj = constructor.newInstance();
		obj.myMethod();
		
	}}
class MyClass {
	public MyClass() {
		System.out.println("My class object ceated");
	}
	public void myMethod() {
		System.out.println("my method created");
	

	}

}
