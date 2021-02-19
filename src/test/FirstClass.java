package test;

import test2.ThirdClass;

public class FirstClass {
	
	int age;
	String Name;
	float Salary;
	
	public void Display() {
		System.out.println("Inside Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		SecondClass obj1 = new SecondClass();
		obj1.Show("Rachana");
		
		SecondClass obj2 = new SecondClass();
		obj2.Show("Sanjana");
		
		obj2.Calculate();
		
		ThirdClass obj3 = new ThirdClass();
		obj3.Show("JJJJ");
	}

}
