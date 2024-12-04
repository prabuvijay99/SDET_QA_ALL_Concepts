package Day3_Keyword;

//without final variable
class num
{
	int A= 10;
	
}

//with final variable
class num2
{
	final int C= 10;
	
}

public class FinalVariable {

	public static void main(String[] args) {
 
		
		num nu=new num();
		nu.A=20;
		System.out.println(nu.A);
		
		num2 nu2=new num2();
		
		//nu2.C=20;  once variable was assigned with final keyword it is like constant we cannot change the value of the variable
		
		System.out.println(nu2.C);
		
	}

}
