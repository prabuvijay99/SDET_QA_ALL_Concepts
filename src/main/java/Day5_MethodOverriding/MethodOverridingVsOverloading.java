package Day5_MethodOverriding;


class A
{
	void method1(int a)
	{
		System.out.println(a);
	}
	
	void method2(int b)
	{
		System.out.println(b);
	}
	
}
class B extends A
{   //since method name and definitions are same it is method overriding only implementation is different
	void method1(int a)// method overriding
	{
		System.out.println(a*a);
	}
	// method name is same but number of parameters are different so it is method overloading
	void method2(int a, int b)// method overloading
	{
		System.out.println(a+b);
	}
}
public class MethodOverridingVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("class b can have 3 methods--method overloading");
		B b=new B();
		b.method1(10);
		b.method2(20);
		b.method2(10, 20);
		System.out.println("class A can have 2 methods--method Overriding");
		A a=new A();
		a.method1(10);
		a.method2(20);
		
		
	}

}
