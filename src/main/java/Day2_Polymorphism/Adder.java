package Day2_Polymorphism;
//Method Overloading
public class Adder {
	
	int a=10,b=20;
	
	void add()  // method with no parameter
	{    
		System.out.println(a+b);
	}
	
	void add(int a,int b) // method with 2 params
	{
	System.out.println(a+b);
	}	
	
	void add(int a,int b,int c) // method with 3 params
	{
	System.out.println(a+b+c);
	}	
	
	void add(int a,int b,int c,int d) // method with 4 params
	{
	System.out.println(a+b+c+d);
	}	
	
	void add(int a,int b,double c,int d) // method with 4 params
	{
	System.out.println(a+b+c+d);
	}	
	
}