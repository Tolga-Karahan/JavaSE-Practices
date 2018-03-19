// Totaling the numbers in an ArrayList<Number>
import java.util.ArrayList;

public class TotalNumbers
{
     public static void main(String[] args)
     {
          Number[] numbers = {1, 2.3, 8, 4.5};
          ArrayList<Number> numberList = new ArrayList<>();

          for(Number number : numbers)
             numberList.add(number);

          System.out.printf("%nnumberList contains: %s%n", numberList);
          System.out.printf("Total of the numbers in the numberList: %.1f%n",
             sum(numberList));
     }

     public static double sum(ArrayList<Number> list)
     {
          double total = 0;

          for(Number number : list)
             total += number.doubleValue();

          return total;
     }
}
