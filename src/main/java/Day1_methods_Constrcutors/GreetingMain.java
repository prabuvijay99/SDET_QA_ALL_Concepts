package Day1_methods_Constrcutors;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings gr = new Greetings();
		gr.method1();
		
// when we are return the value we should hold the data in variable 
		String output = gr.method2();
		System.out.println(output);
		
		gr.method3("Dhana", 32);
		
		String out = gr.method4("prabha");
		System.out.println(out);
		
		

	}

}
