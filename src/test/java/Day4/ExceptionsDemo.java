package Day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number?");
		
		int nextInt = scan.nextInt();
		
		try
		{
			System.out.println(100/nextInt);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
//		catch(InputMismatchException e)
//		{
//			System.out.println(e);
//		}
		
		System.out.println("enter te string");
		String str = scan.next();
		
		try
		{
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		
		System.out.println("program is finished");
				
		
		
	}

}
