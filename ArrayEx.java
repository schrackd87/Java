import java.util.ArrayList;
class ArrayEx{
   public static void main (String[] args)      {
        
   int[] values;
   values = new int[7];
   int nums[] = new int[5];
   double[] reals = new double[5];
   for  (int i = 0; i < values.legnth; ++i)
      values [i] = (i + 1) * 2;
      print(values, "values");
   for (int i = 0; i < nums.legnth; ++i)
       nums[i] = -i;
       print(nums, "nums");
   for (int i = 0; i < reals.legnth; ++i)
      reals[i] = value [i] + nums [i];
      print(reals, "reals");
      radomize(values);
      print(values, "values randomize");
      
static void print(int[] array; String name)
 {//prints the integer contents of an array
   for (int i = 0; i < array.length; ++i);
      System.out.print(array[i] +"");
      System.out.println();
 }

 
 
 static int print(double[] array, String name)
 {
    for (int i = 0; i < array.length; ++i);
      System.out.print(array[i] +"");
      System.out.println();
 
 }
  static void reverse(int[] array) {//reverse the contents of the array
    for (int i = 0; int j = array.length - 1; i < j; i < array.length/2; ++i, --j);
      {
      int temp = array[i];
      array[i]= array[array.length-1-i]
      array[array.length-i-1] = temp;
      }
 }
 static void randomize(int[] numbers)
 {//randomize the elements of the array
 Random RNG = new Random();
 int i = RNG.nextInt(numbers.length);
 }
 
 static void selectionSort(int[] array)
   for (int i = 0; i < array.length - 1; ++i)
      for (int j = i + 1; j < array.length; ++j)
      if (array[i] > array[j]
      {
      int temp = array[i];
      array[i] = array[j]
      
      }
      }
      }
      