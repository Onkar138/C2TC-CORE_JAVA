package p2;
public class C {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

/*
 
public static void main(String[] args) {
		int []x= {0,1,2,2,3,7,7,9,10,10,54,89};
		int []temp=new int[x.length];
		
		for (int i = 0; i <x.length-1 ; i++) {
			for (int j= 0; j < x.length; j++) {
				if(x[i]>x[i+1]){
				int y[i]=x[i];
				x[i]=x[i+1];
				x[i+1]=y[i];
		System.out.println(x[i]);
		System.out.println(x[i+1]);
			}
		}
		
*/