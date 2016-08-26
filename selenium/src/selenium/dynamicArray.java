package selenium;

public class dynamicArray {

	public static void main(String[] args) 
	{
		int[] sal=new int[8];
		
		
		//writing the data into array
		
		sal[3]=50000;
		sal[1]=30000;
		
		//length of the array
		
		System.out.println(sal.length);
		
		//reading the values from an array
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(sal[i]);
			
			
		}
		
	}
}
