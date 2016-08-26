package selenium;

import java.util.ArrayList;

public class arraylisteg {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<String>();
		
		//writing the data into arraylist
		
		s.add("Selenium");
		s.add(1, "UFT");
		s.add("Manual");
		s.add("Sabitha");
		s.add("Lakshmi");
		
		//length of the arraylist
		
		System.out.println(s.size());
		
		//read the data from an arraylist
		
		for (int i = 0; i < s.size(); i++)
		{
			
			System.out.println(s.get(i));
			
		}
		

	}

}
