//Java Program to right rotate the elements of an array

package p4;
public class D {
	public static void main(String[] args) {
		int []x= {1,2,3,4,5};					//3   4   5   1   2
		System.out.println("Original array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("_____________________________________________");
		System.out.println("Array after right rotation: ");
		for (int j = 0; j < 3; j++) {
			int last;
			last=x[x.length-1];
			for (int i =x.length-1 ; i>0 ; i--) {
			x[i]=x[i-1];
		}
			x[0] = last; 
	}
		for (int i : x) {
			System.out.print(i+" ");
		}
	}
}