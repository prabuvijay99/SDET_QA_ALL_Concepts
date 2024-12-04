package Day3_Keyword;

public class thisKeyWord {
	
	int x,y;
	
	//constructor class variable and local variables are different
	
	thisKeyWord(int a, int b)
	{
	x =a;
	y=b;
	}
	//constructor class variable and local variables are same
	
	thisKeyWord(double x, int y)
	{
	x=x;
	y=y;
	}

	thisKeyWord(int x, double y)
	{
	this.x=x;
	this.y=(int) y;
	
	}
	
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		//for different variables name
		thisKeyWord key=new thisKeyWord(10,20);
		key.display();
		
		
		//for same variables name  --- will get output 0 bcos constructor not ale to find the class variable and local varible
		// inorder to resolve we should use this keyword
		thisKeyWord key1=new thisKeyWord(10.0,20);
		key1.display();
		
		thisKeyWord key2=new thisKeyWord(10,20.0);
		key2.display();
		
	}
}
