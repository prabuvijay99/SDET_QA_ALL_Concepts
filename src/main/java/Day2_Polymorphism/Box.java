package Day2_Polymorphism;
//Constructor overloading!!!
public class Box {
	
	double length,height,depth;
	
	Box() // constructor without params
	{
		length=height=depth=0;
	}
	
	Box(double l,double h,double d) // constructor with 3 params
	{
		length = l;
		height =h;
		depth=d;
				
	}
	Box(int val) // Constructor with 1 params
	{
		length=height=depth=val;
	}
	
	double volume(){
		return length*height*depth;
	}
	
}
