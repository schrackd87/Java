//Ben Blacklock MS382
//This program does a bubble sort on a hard coded int array

public class Bubble
{
	public static void main(String[] args)
	{
		int[] Bubble = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		print(Bubble);//before the sort
		
		sort(Bubble);//sorts the array	
	}
	
	static void sort(int[] array)
	{
		int n = array.length;
		int temp;
		
		//The inner for loop will cause the individual values to bubble. The outer makes it continually iterate until sorted
		for(int i = 0; i < n-1; i++)
		{	
			for(int j = 1; j < n; j++)
			{
				if(array[j-1] > array[j])
				{
					temp = array[j-1];
					array[j-1] = array[j];	
					array[j] = temp;
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