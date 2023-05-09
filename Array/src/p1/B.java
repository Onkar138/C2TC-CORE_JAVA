package p1;
public class B {
	public static void main(String[] args) {
		try {
		int []x=new int[6];
		x[0]=1;
		x[1]=3;
		x[2]=69;
		x[3]=28;
		x[4]=100;
		x[5]=20;
		for(int i=0;i<7;i++) {
			System.out.println(x[i]);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}

}
