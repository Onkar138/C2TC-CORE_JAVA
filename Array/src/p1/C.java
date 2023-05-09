package p1;
public class C {
	public static void main(String[] args) {
		int []x= {32,23,14,21,7};
		int []temp=new int[x.length];
		int j=0;
		for(int m=0;m<x.length;m++) {
			for(int i=0;i<x.length-1;i++) {     //0 to 7
				if(x[i]>x[i+1]) {
					temp[j]=x[i+1];
					System.out.println(temp[j]);
					j++;
				}
			}
		}
	}
}

