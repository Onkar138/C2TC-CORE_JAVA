package p2;
public class A {
	public static void main(String[] args) {
		int []x= {0,1,2,2,3,7,7,9,10,10,54,89};
		int []temp=new int[x.length];
		int j=0;	
		for(int i=0;i<x.length-1;i++) {     //0 to 7
			if(x[i]!=x[i+1]) {
				temp[j]=x[i];
				j++;
			}
	}
			temp[j]=x[x.length-1];
			System.out.println(j);
		for(int i=0;i<j+1;i++) {                //Only printing for all elements this logic
			System.out.println(temp[i]);
		}
	}
}
