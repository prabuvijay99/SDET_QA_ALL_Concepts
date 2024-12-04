package Day4_Inheritance;

//Hierarchy Inheritance
class parent1 {
	int a;
	void show() {
		System.out.println(a);
	}
}

class child1 extends parent1{
	int b;
	void display1() {
		System.out.println(b+a);
	}
}

class child2 extends parent1{
	int c;
	void display2() {
		System.out.println(c+a);
	}
}

class child3 extends parent1{
	int d;
	void display3() {
		System.out.println(a+d);
	}
}

public class hierarchyInheritance {

	public static void main(String[] args) {
	child1 c1=new child1();
	System.out.println("child 1");
	c1.a=10;
	c1.b=20;
	c1.display1();
	System.out.println("child 2");
	child2 c2=new child2();
	c2.a=10;
	c2.c=30;
	c2.display2();
	System.out.println("child 3");
	child3 c3=new child3();
	c3.a=10;
	c3.d=40;
	c3.display3();
	}

}
