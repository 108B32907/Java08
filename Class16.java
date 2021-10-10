package Class16.java;
 class csphere{
	 private int x;
	 private int y;
	 private int z;
	 private int radius;
	 
	 void setLocation(int a,int b,int c) {
		 x=a;
		 y=b;
		 z=c;
	 }
	 void setRadius(int r) {
		 radius=r;
	 }
	 double surfaceArea() {
		 return radius*radius*4*3.14;
	 }
	 double volume() {
		 return radius*radius*radius*3*3.14/4;
	 }
	 void showcenter() {
		 System.out.println("x=" +x+",y=" +y+",z="+z);
	 }
 }
public class Class16 {

	public static void main(String[] args) {
		csphere cs=new csphere();
		cs.setLocation(3,4,5);
		cs.showcenter();
		cs.setRadius(1);
		System.out.println("CSphere物件的表面積" +cs.surfaceArea());
		System.out.println("CSphere物件的表面積" +cs.volume());
		
	}

}
