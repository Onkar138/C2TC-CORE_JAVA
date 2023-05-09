//Java Program to sort the elements of an array in ascending and descending  order and 1st to last elements order:

package p5;
public class A {
	public static void main(String[] args) {
		int[] x= {5,3,1,4,2};
		int temp;
		System.out.println("Original array: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if (x[j]>x[j+1]) {
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("array elements in ascending  order:");
		for (int i : x) {
			System.out.print(i+" ");
		}
		for (int i = 0; i < x.length-1; i++) {
			for (int j = 0; j < x.length-1; j++) {
				if (x[j]<x[j+1]) {
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("array elements in desending order:");
		for (int i : x) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("___________________________________________________");
		for (int i = 0; i < x.length; i++) {
			System.out.println(i+1+"th Largest Number in an Array:");
			System.out.println(x[i]);
		}
	}
}
