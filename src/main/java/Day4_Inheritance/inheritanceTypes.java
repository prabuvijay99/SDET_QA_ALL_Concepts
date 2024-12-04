package Day4_Inheritance;

class parent
{
	int a = 10;
	void output() {
		System.out.println("post_value of A"+ (a+10));
	}
}
// Single Inheritance
class child extends parent
{
	int b = 20;
	void outputb() {
		System.out.println("value of B"+ (a+b));
	}
}
// Multilevel Inheritance parent to child to multiple child
class multipleChild extends child
{
	int c = 30;
	void outputc() {
		System.out.println("value of c"+ (a+b+c));
	}
}


public class inheritanceTypes {

	public static void main(String[] args) {
		
		child cobj=new child();
		int val_a = cobj.a;
		System.out.println("pre_value of A"+val_a);
		cobj.output();
		cobj.outputb();
		
		multipleChild mcobj=new multipleChild();
		mcobj.output();
		mcobj.outputb();
		mcobj.outputc();
	}

}
