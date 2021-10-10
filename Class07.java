package Class07.java;


class ctest{
	int[] x= {3,8,0};
	void test() {
		for(int i=0;i<=2;i++) {
			if(x[i]==0) {
				System.out.println("计0");
			}
			else if(x[i]%2==0) {
				System.out.println("计案计");
			}
			else {
				System.out.println("计计");
			}
		}
	}
	
}
public class Class07 {

	public static void main(String[] args) {
		ctest ct;
		ct=new ctest();
		ct.test();
	}

}
