package Class09.java;

class ccalculator{
	int a,b,c;
	void set_value(int x,int y,int z) {	
		a=x;b=y ; c=z;
	}
	void show(){
		System.out.println("a="+a+ " ,b=" +b+ " ,c="+c);	
	}
	int add() {
		
		return a+b+c;
	}
	int sub() {

		return a-b-c;
	}
	int mul() {

		return a*b*c;
	}
	double avg() {

		return (a+b+c)/3.0;
	}
}

public class Class09 {

	public static void main(String[] args) {
		ccalculator obj=new ccalculator();
		obj.set_value(25,3,7);
		obj.show();
		System.out.print("�T�Ƥ��M= " );
		System.out.println(obj.add());
		System.out.print("a-b-c����= " );
		System.out.println(obj.sub());
		System.out.print("�T�Ƥ��n= " );
		System.out.println(obj.mul());
		System.out.print("�T�ƥ���= " );
		System.out.println(obj.avg());
	}

}
