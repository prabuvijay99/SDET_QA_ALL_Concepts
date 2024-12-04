package Day3_Keyword;


class A1
{
	void m1()
	{
		System.out.println("This is not final Method");
	}
	
	final void m2()
	{
		System.out.println("This is final Method");
	}
}

class A2 extends A1
{
	void m1()
	{
		System.out.println("this method is overrided");
	}

	
// """Final methods cannot override in child classess"""	
//	void m2()
//	{
//		System.out.println("we cannot overide the final method in the child classes");
//	}
}
public class finalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
