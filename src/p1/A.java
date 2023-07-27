package p1;

//An abstract class can consist of both complete and incomplete methods in it.
//To develop incomplete method in an abstract class, it is mandatory to use "abstract" keyword.
//An object of abstract class cannot be created.
//we can create static and non-static members both in abstract class.

abstract public class A {
	
	static int x;
	int y;
	static float f= 11.11f;
	char c='@';
	
	public void test1() {
	}
		abstract public void test2();	
	
	public static void main(String[] args) {
	A a1=new A();		//we cannot create an object in abstract class
	}
}
