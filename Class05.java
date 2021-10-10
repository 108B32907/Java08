package Class05.java;

class cbox{
	int length;
	int height;
	int width;
	private int volume(){
		return length*height*width;
	}
	private int surfaceArea() {
		return (length*height+length*width+height*width)*2;
	}
	void showData() {
		System.out.print("box物件的length="+length+" ");
		System.out.print("box物件的height="+height+" ");
		System.out.println("box物件的width="+width);
	}
	void showAll() {
		showData();
		System.out.print("box物件的體積 "+volume()+" ");
		System.out.println("box物件的表面積 "+surfaceArea());
	}
}

public class Class05 {

	public static void main(String[] args) {
		cbox box;
		box=new cbox();
		box.length=1;
		box.height=1;
		box.width=1;
		box.showAll();
		
	}
}
