package Day1_methods_Constrcutors;

//ways to store data into variables using object , Methods, Constructor

public class Student {

	int sNo;
	String sName;
	char grad;
	
	void printStudData()
	{
		System.out.println(sNo+" "+sName+" "+grad);
	}
	
	//by methods
	void loadStudData(int no, String name, char grade)
	{
		sNo = no;
		sName=name;
		grad=grade;
	}
	
	//by Constructor -- majorly used
	//constructor name should be same as class name
	//can take parameters like method
	//Constructor never return any value
	// no need to give return type it is not mandatory
	//only used to initialize to store data to variables
	
	Student(int num, String Name, char grad1)
	{
		sNo=num;
		sName=Name;
		grad=grad1;
		
	}
}