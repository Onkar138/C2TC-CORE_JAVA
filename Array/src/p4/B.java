package p4;
public class B {
	public static void main(String[] args) {
		int []x= {23,37,1,67,43,1,45,37,81,67,78,78,45,81};
	int temp;
	int []temp1=new int [x.length];
	int a=0;
	int []y=new int [x.length];
			for (int j = 0; j < x.length-1; j++) {
				for(int i=0; i< x.length-1;i++){
						if(x[i]>x[i+1]) {
							temp=x[i];
							x[i]=x[i+1];
							x[i+1]=temp;				
					  }
				}
			}
			System.out.println("Array Size="+x.length);
			System.out.println("Sorted Array Elements Are Given Below:");
				temp=x[x.length-1];
				for (int i = 0; i < x.length-1; i++) {
					System.out.println(x[i]);
				}
				System.out.println(temp);
		System.out.println("______________________________________________________________");
		System.out.println("Copy One Array Elements To Empty Array Are Given Below:");
		for (int i = 0; i < y.length; i++) {
			 y[i]=x[i];
			 System.out.println(y[i]);
		}
		System.out.println("______________________________________________________________");
			System.out.println("Remove Dublicate Array Elements Are Given Below:");				
			for (int i = 0; i < x.length-1; i++) {
				if (x[i]!=x[i+1]) {
					 temp1[a]=x[i];
					 a++;
				}
		}
			temp1[a]=x[x.length-1];
			for (int i = 0; i <a+1; i++) {
				System.out.println(temp1[i]);
			}
		System.out.println("______________________________________________________________");
		System.out.println("Double Array Elements Are Given Below:");
			for (int i = 0; i < x.length-1; i++) {
				if (x[i]==x[i+1]) {
					System.out.println(x[i]);
				}
		 }	
			System.out.println("______________________________________________________________");
			System.out.println("Single Array Elements Are Given Below:");
	}
}
