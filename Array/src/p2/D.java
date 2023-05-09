package p2;
public class D {
	public static void main(String[] args) {
		int []x= {0,4,2,1};
		int []temp=new int[x.length];
		int []y=new int[x.length];
		
		for (int i = 0; i <x.length-1 ; i++) {
			for (int j= 0; j < x.length; j++) {
				if(x[i]>x[i+1]){
			    y[i]=x[i];
				x[i]=x[i+1];
				x[i+1]=y[i];
		System.out.println(x[i]);
		//System.out.println(x[i+1]);
			}
		}
		}
	}
}
