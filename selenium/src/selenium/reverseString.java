package selenium;

public class reverseString {

	public static void main(String[] args) 
	{
		//ahtibas
		String org="suneetha";
		
		int len=org.length();
		
		for (int i = len-1; i >= 0 ; i--) 
		{
			char rev=org.charAt(i);
			System.out.print(rev);
		}
		System.out.println();
	}

}
