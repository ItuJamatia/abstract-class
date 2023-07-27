package p4;

public class C extends B{

	@Override
	public void test() {
		System.out.println(1);
	}

	public static void main(String[] args) {
		C c1=new C();
		c1.test();
	}

}
