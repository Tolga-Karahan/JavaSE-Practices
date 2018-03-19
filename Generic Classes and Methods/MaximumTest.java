// Generic method maximum returns largest of the three objects.

public class MaximumTest
{
       public static void main(String[] args)
       {
             System.out.printf("Maximum of %d, %d and %d is %d%n",
                 10, 0, 17, maximum(10, 0, 17));
             System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n",
                 3.7, 8.9, 1.4, maximum(3.7, 8.9, 1.4));
             System.out.printf("Maximum of %s, %s and %s is %s%n",
                 "Tolga", "Karahan", "CENG", maximum("Tolga", "Karahan", "CENG"));          

       }

       public static <T extends Comparable<T>> T maximum(T x, T y, T z)
       {
             T max = x;

             if(y.compareTo(max) > 0)
                 max = y;

             if(z.compareTo(max) > 0)
                 max = z;

             return max;
       }
}
