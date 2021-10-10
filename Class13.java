package Class13.java;

class ccircle {
	 double area( double r) {
		 return r*r*3.14;
	}
	 float area(float r) {
		 return (float) (r*r*3.14);
	 }
	 double area(int r) {
		 return  r*r*3.14;
	 }
}
public class Class13 {

	public static void main(String[] args) {
		ccircle cir =new ccircle();
		System.out.println(cir.area(2));
		System.out.println(cir.area(2.2f));
		System.out.println(cir.area(2.2));
	}
}