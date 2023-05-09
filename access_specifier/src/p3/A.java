package p3;
public class A {
	public A(){
		this(100);
		System.out.println("from constructor");		
	}
	public A(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.test1();
	}
	public void test1() {
		this.test2();
		System.out.println("from test1");	
	}
	public static void test2() {
		System.out.println("from test2");	
	}
}
