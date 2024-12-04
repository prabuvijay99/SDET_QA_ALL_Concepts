package Day1_methods_Constrcutors;

public class constructorDemo {
	
	int x,y;
	
	constructorDemo() //Default constructor
	{
		x=100;
		y=120;
		
	}

	constructorDemo(int a, int b) // parameterized constructor
	{
		x=a;
		y=b;
	}
	
	int calculation() // with return values
	{
		return x+y;
	}
	
	void calc() // without return values
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Default constructor
		constructorDemo demo=new constructorDemo();
		demo.calc();
		
		// parameterized constructor
		constructorDemo demo1= new constructorDemo(60,80);
		int cal =demo1.calculation();
		System.out.println(cal);

	}

}
