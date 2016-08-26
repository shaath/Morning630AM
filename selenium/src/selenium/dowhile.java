package selenium;

public class dowhile {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			if (i==333)
			{
				break;
			}
			i++;
		}
		while (i<=500);

	}

}
