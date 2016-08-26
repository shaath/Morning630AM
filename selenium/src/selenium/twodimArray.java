package selenium;

public class twodimArray 
{

	public static void main(String[] args) 
	{
		int[][] s=new int[2][3];
		
		//length of the rows
		
		System.out.println(s.length);
		//length of the columns
		
		
		System.out.println(s[0].length);
		
//		writing the data into the array
		
		s[0][1]=20000;
		s[1][2]=40000;
		
//		read the data from an array
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
			
		}
		
		

	}

}
