package selenium;

public class polindrome {

	public static void main(String[] args)
	{
		//oho----->oho
		String rev="";
		String org="oho";
		int len=org.length();
		for (int i = len-1; i >= 0; i--)
		{
			rev=rev+org.charAt(i);
			
		}
		System.out.println(rev);
		
		if (org.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is polindrome");
			
		}
		else
		{
			System.out.println("Given String is  not a polindrome");
		}

	}

}
