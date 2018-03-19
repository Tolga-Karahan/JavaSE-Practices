// Wildcard test program.
import java.util.ArrayList;

public class WildcardTest
{
     public static void main(String[] args)
     {
          Integer[] integers = {5, 7, 12, 74};
          ArrayList<Integer> integerList = new ArrayList<>();

          for(Integer integerVal : integers)
            integerList.add(integerVal);

          System.out.printf("%nintegerList contains: %s%n", integerList);
          System.out.printf("Total of the elements in integerList: %.0f%n",
            sum(integerList));

          Double[] doubles = {1.8, 3.7, 4.3, 10.7};
          ArrayList<Double> doubleList = new ArrayList<>();

          for(Double doubleVal : doubles)
             doubleList.add(doubleVal);

          System.out.printf("%ndoubleList contains: %s%n", doubleList);
          System.out.printf("Total of the elements in doubleList: %.1f%n",
             sum(doubleList));

          Number[] numbers = {5, 1.8, 9, 3.2};
          ArrayList<Number> numberList = new ArrayList<>();

          for(Number number : numbers)
             numberList.add(number);

          System.out.printf("%nnumberList contains: %s%n", numberList);
          System.out.printf("Total of the elements in numberList: %.1f%n",
             sum(numberList));
     }

     public static double sum(ArrayList<? extends Number> list)
     {
          double total = 0;

          for(Number element : list)
             total += element.doubleValue();

          return total;
     }
}
