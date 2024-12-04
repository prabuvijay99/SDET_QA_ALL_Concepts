package Day8;

public class getTheDynamciIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Showing 1 to 10 of 7381078989 (73818989 Pages)";
//											  -
		int firstIndex = str.indexOf("(") + 1;	
		int lastIndex = str.indexOf("Pages") - 1;
		
		System.out.println(firstIndex);
				
		System.out.println(lastIndex);		
		
		String substring = str.substring(firstIndex, lastIndex);
		System.out.println(substring +" Pages");
				
	}
	

}
