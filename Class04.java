package Class04.java;

class cbox{
	int length;
	int height;
	int width;
}

public class Class04 {

	public static void main(String[] args) {
		cbox box;
		box=new cbox();
		box.length=15;
		box.height=25;
		box.width=10;
		
		System.out.println("length= "+box.length);
		System.out.println("height= "+box.height);
		System.out.println("width= "+box.width);
	}
}
