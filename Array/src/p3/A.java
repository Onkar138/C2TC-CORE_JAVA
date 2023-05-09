package p3;
public class A {
	public static void main(String[] args) {
		int []x=new int [5];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		System.out.println("Array length="+ x.length);
			for (int i = 0; i < x.length+1; i++) {
				System.out.println(x[i]);
			}
	}


}
