package p2;

import p1.A;
public class D extends A {
	public static void main(String[] args) {
		D d1=new D();
		System.out.println(d1.x);
		System.out.println(D.y);
		d1.test();
	}
}
