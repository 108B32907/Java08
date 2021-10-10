package Class06.java;

class ccircle{
	double pi=3.14;
	double radius;
	void show_periphery() {
		System.out.println("periphery="+2*pi*this.radius);
	}
}
public class Class06 {

	public static void main(String[] args) {
		ccircle cir1;
		cir1=new ccircle();
		cir1.radius=3.0;
		cir1.show_periphery();
	}

}
