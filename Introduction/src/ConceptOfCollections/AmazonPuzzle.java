package ConceptOfCollections;

import java.util.ArrayList;

public class AmazonPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,3,5,6,5,6,6,7,7,2,3,3,2,2,2,9,0};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int j=0; j<=a.length-1; j++)
		{
			int k = 0;
			//if(!al.contains(a[j]))
			//{
				//al.add(a[j]);
				for(int i=j; i<=a.length-1; i++)
				{
					if(a[j]==a[i])
					{
						k++;
					}
				}
				System.out.println(a[j]+" is repeated by:"+k+" times");
				if(k==1)
				{
					System.out.println(a[j] +" is the unique number in the array");
				}
			//}
		}
		System.out.println(al);
	}

}
