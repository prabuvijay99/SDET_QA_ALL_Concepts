package Day2_Polymorphism;

public class Boxmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box imp=new Box();
		double volume = imp.volume();
		System.out.println(volume);
		
		Box imp2=new Box(10,20,3);
		double volume2 = imp2.volume();
		System.out.println(volume2);
		
		Box imp3=new Box(10);
		double volume3 = imp3.volume();
		System.out.println(volume3);
		
		
	}

}
