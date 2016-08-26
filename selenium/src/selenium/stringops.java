package selenium;

public class stringops 
{
	public static void main(String[] args) 
	{
		String name="QEdge";
		int len=name.length();
		System.out.println(len);
		
		char s=name.charAt(2);
		System.out.println(s);
		
		
		String x=name.substring(1, 4);
		
		System.out.println(x);
		
		String y=name.substring(1);
		System.out.println(y);
	}

}
