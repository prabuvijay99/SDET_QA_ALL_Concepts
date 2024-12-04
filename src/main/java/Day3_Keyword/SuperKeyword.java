package Day3_Keyword;

// parent class
class animal
{
	String color = "Black";
}
//child class
class dog extends animal
{
	String color = "White";
	
	void display() {
		
		System.out.println(color+" without super keyword");  ///  it will the data of variable present in the child class
		
		System.out.println(super.color + " without super keyword"); // it will the data of variable present in the immediate parent class
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dg=new dog();
		dg.display();
	}

}
