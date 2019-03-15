package Java;

public class MultidimensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 13, 18,21 }, { 40, 25, 61 }, { 91, 18, 2 } };
		/*18 21 13
		  40 25 61
		  91 16 20*/
		/*
		//Printing the highest number in the array
		int Temp = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) 
				{
	// System.out.println(a[i][j]);
	
					if (Temp < a[i][j]) 
					{
						Temp = a[i][j];
					}

				}
		}
		System.out.println(Temp);
		
		//Printing the lowest number in the array
		Temp = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) 
				{
	// System.out.println(a[i][j]);
	
					if (Temp > a[i][j]) 
					{
						Temp = a[i][j];
					}

				}
		}
		System.out.println(Temp);*/
		
		
		//Print the highest value of column of minimum value
				int Min = a[0][0];
				int MinValueColumn = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(Min>a[i][j])
				{
					Min = a[i][j];
					MinValueColumn = j;
				}
			}
			
		}
		

		System.out.println("Minimum value of the matrix: "+Min);
		System.out.println("column of minimum value:"+MinValueColumn);
		
		int columnHighest = a[0][MinValueColumn];
		for(int k =0; k<a.length;k++)
		{
		   if(columnHighest<a[k][MinValueColumn])
		   {
			   columnHighest=a[k][MinValueColumn];
		   }
		
			
		}
		System.out.println("Highest column value:"+columnHighest);
		
			
	}

}
