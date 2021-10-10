package Class02.java;

class cbbb{
	double x;
	double y;
	double avg;
}

public class Class02 {

	public static void main(String[] args) {
		cbbb obj1;
		obj1=new cbbb();
		obj1.x=5.2;
		obj1.y=3.9;
		
		cbbb obj2;
		obj2=new cbbb();
		obj2.x=6.5;
		obj2.y=4.6;
		
		cbbb avg;
		avg=new cbbb();
		avg.x=(obj1.x + obj2.x)/2;
		avg.y=(obj1.y + obj2.y)/2;
		
		System.out.println("obj1的x值"+obj1.x +" "+"obj1的y值"+obj1.y);
		System.out.println("obj2的x值"+obj2.x +" "+ "obj2的y值"+obj2.y);
		System.out.println("avg的x值"+avg.x +" "+ "avg的y值"+avg.y);
	}

}
