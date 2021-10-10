package Class12.java;

class cwin{
	int height;
	int width;
	String name;
	
	void setw(int w) {
		width=w;
	}
	void seth(int h) {
		height=h;
	}

	void setname(String s) {
		name=s;
	}
	void setwindows(int w,int h,String name) {
		width=w; height=h; name="s";
	}
	public void show() {
		System.out.println("name= "+name );
		System.out.println("w= "+width +", h= " +height );
	}
}
public class Class12 {

	public static void main(String[] args) {
		cwin cw =new cwin();
		cw.setname("My windows");
		cw.setw(5);
		cw.seth(3);
		cw.show();
	}

}
