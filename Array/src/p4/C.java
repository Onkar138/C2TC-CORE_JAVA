//Java Program to print the sum of all the items of the array:
package p4;
public class C {
	public static void main(String[] args) {
		int []x= {10,30,50,20,40};
		int sum=0;
		//System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {
			sum=sum+x[i];
		}
		System.out.println("Sum of array: "+sum);
	}
}