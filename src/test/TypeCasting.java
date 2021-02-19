package test;

public class TypeCasting {
	
	public static void main(String[] args) {

	//Implicit TypeCasting
	System.out.println("Implicit Ttypecasting");
	
	char a = 'A';
	System.out.println("Value of a:"+a);
	
	int b=a;
	System.out.println("Value of b"+b);
	
	//explicit Conversion
	System.out.println("Explicit Typecasting");
	
	double x = 45.5;
	int y = (int) x;
	System.out.println("Value of x:" +x);
	System.out.println("Value of x:" +y);
	}
	
}
