package Day1_methods_Constrcutors;

public class StudentClass {

	public static void main(String[] args) {
		
//		Student std=new Student();	
//		
//		// by using the object reference to variables
//		
//		std.sNo=101;
//		std.sName="Prabha";
//		std.grad='A';
//		std.printStudData();
//		
//		// by using the methods to assign the variables
//		
//		std.loadStudData(100, "Vijay", 'S');
//		std.printStudData();
//		
		// by constructor
		Student std1=new Student(102, "Prabha", 'C');
		std1.printStudData();
		
		}
	
	
	
	
}
