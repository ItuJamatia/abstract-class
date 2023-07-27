package p3;

//If the variable is non-static, we inherit and create an object


public class B extends A{

	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		b1.test1();
		System.out.println(b1.x);
	}
	
	@Override
	public void test1() {
		System.out.println("OVERRIDE");
	}
}
