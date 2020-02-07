//Ben Blacklock MS382
//This program does a bubble sort on a hard coded int array

public class assignment5
{
	public static void main(String[] args)
	{
		int[] assignment5 = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		print(assignment5);//before the sort
		
		sort(assignment5);//sorts the array	
	}
	
	static void sort(int[] array)
	{
		int arr = array.length;
		int z;
		
		//The inner for loop will cause the individual values to bubble. The outer makes it continually iterate until sorted
		for(int i = 0; i < arr-1; i++)
		{	
			for(int x = 1; x < arr; x++)
			{
				if(array[x-1] > array[x])
				{
					z = array[x-1];
					array[x-1] = array[x];	
					array[x] = z;
				}
			}
			print(array);//print upon each iteration
		}
	}
	
	
	static void print(int[] array)
	{//prints the integer contents of an array
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println(" ");
	}
}