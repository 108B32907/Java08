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
		
		System.out.println("obj1��x��"+obj1.x +" "+"obj1��y��"+obj1.y);
		System.out.println("obj2��x��"+obj2.x +" "+ "obj2��y��"+obj2.y);
		System.out.println("avg��x��"+avg.x +" "+ "avg��y��"+avg.y);
	}

}