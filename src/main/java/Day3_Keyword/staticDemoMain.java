package Day3_Keyword;

public class staticDemoMain {

public static void main(String[] args) {
		
		//static methods  can access the static stuffs directly without creating object
		// class name should be mentioned before variable and methods because main method is created in separate class
		// for static main no need to create object to access static variable and static method
	
		System.out.println(staticDemo.a);
		staticDemo.method1();
		
		//static methods  can access the non static stuffs thru object
		staticDemo dem=new staticDemo();
		System.out.println(dem.b);
		dem.method2();
		
		dem.method3();

}
}