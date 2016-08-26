package selenium;

public class switchcase 
{
	public static void main(String[] args)
	{
		String course="Selenium";
		
		switch (course) 
		{
		case "Selenium":
			System.out.println("This is Selenium");
			break;
		case "Qtp":	
			System.out.println("This is Qtp");
			break;
		case "Manual":
		    System.out.println("This is Manual");
		    break;
		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
