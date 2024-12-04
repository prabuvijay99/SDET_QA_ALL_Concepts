package Day5_MethodOverriding;

//parent class
class bank
{
	double roi()
	{
		return 1.5;
	}
}
// child 1 class extends parent class since methods are same it is method overriding!!!
class SCB extends bank
{
	double roi()
	{
		return 11.5;
	}
}

//child 2 class extends parent class since methods are same it is method overriding!!!
class ICICI extends bank
{
	double roi()
	{
		return 10.5;
	}
}


public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation for SCB so method overload with parent class it return the value of roi related to scB method = 11.5
		
		SCB sc=new SCB();
		System.out.println(sc.roi());
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		
	}

}
