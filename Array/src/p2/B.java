package p2;
public class B {
	public static void main(String[] args) {
		int []x= {34,6,45,73,10,2};
		int []temp=new int [x.length];
		//int m=0;
		for (int i = 0; i <x.length-1 ; i++) {
			for (int j= 0; j < x.length-1; j++) {
				if(x[i]>x[i+1]) {
					temp[i]=x[i];
					System.out.println(temp[i]);
				}
				
			}	
		}
		/*for(int i=0;i<m+1;i++) {                //Only printing for all elements this logic
			System.out.println(temp[i]);
		}*/
	}

}
