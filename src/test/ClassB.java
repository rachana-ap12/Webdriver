package test;

public class ClassB {
	
	String myName;
	
	public ClassB() {
		System.out.println("iNSIDE CLASS B CONSTRUCTOR");
	}
	
	public ClassB(String Name) {
		System.out.println("iNSIDE CLASS B");
		System.out.println("Name " +Name);
		
		myName = Name;
	}

}
