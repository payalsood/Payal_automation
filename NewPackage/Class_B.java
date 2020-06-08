package NewPackage;

public class Class_B extends Class_A {

	void m2() {
		System.out.println("child m2");
	}
	
	public static void main(String[] args) {
	 Class_A a = new Class_B();
	 a.m2();

	}

}
