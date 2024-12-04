package Day3_Keyword;

public class staticDemo {

	static int a = 10; //static variable
	int b=50; // non static variables
	
	static void method1() // static methods
	{
		System.out.println("this is static");
	}
	
	void method2() // non static methods
	{
		System.out.println("this is non static");
	}
	
	void method3() // non static method 
	{
		System.out.println(a);
		System.out.println(b);
		method1();
		method2();
	}
	
//	public static void main(String[] args) {
//		
//		//static methods  can access the static stuffs directly without creating object
//		System.out.println(a);
//		method1();
//		
//		//static methods  can access the non static stuffs thru object
//		staticDemo dem=new staticDemo();
//		System.out.println(dem.b);
//		dem.method2();
//		
//		dem.method3();

//	}

}
