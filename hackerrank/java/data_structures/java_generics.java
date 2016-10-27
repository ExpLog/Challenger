//https://www.hackerrank.com/challenges/java-generics


class Printer
{
   public static void printArray(Object[] arr) {
	   for(Object e : arr) {
		   System.out.println(e);
	   }
   }
}