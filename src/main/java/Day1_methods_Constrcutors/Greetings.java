package Day1_methods_Constrcutors;

public class Greetings {
	
	// no parameters --- no return value(void)
	
		void method1() 
		{		
		System.out.println("Hello");
		}
		
	// no parameters -- return value by using return keyword
		
		String method2()
		{
			return ("Hello How are you?");
		}
		
	// with parameter -- no return value(void)
		
		void method3(String name, int age)
		{
			System.out.println("Hello " + name + "your age is "+ age);
		}

	// with parameter -- return value
		String method4(String name)
		{
			return("Hello "+ name);
		}
		
		
}
