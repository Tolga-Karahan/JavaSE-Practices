// Demonstrating IntStream operations.

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.function.IntPredicate;

public class IntStreamOperations
{
      public static void main(String[] args)
      {
            int[] values = {5, 8, 13, 12, 11 ,4, 17};

            // display original values
            System.out.printf("Original values: ");
            IntStream.of(values)
                     .forEach(value -> System.out.printf("%d ", value));
            System.out.println();

            // count, min, max, sum and average of the values
            System.out.printf("%nCount: %d%n", IntStream.of(values).count());
            System.out.printf("Min: %d%n",
                IntStream.of(values).min().getAsInt());
            System.out.printf("Max: %d%n",
                IntStream.of(values).max().getAsInt());
            System.out.printf("Sum: %d%n", IntStream.of(values).sum());
            System.out.printf("Average: %.2f%n",
                IntStream.of(values).average().getAsDouble());

            // sum of values with reduce method
            System.out.printf("Sum via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y));

            // sum of squares of values with reduce method
            System.out.printf("Sum of squares with reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y * y));

            // product of values with reduce method
            System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values).reduce(1, (x, y) -> x * y));

            // even values displayed in sorted order
            System.out.printf("%nEven values displayed in sorted order:%n");
            IntStream.of(values)
                     .filter(value -> value % 2 == 0)
                     .sorted()
                     .forEach(value -> System.out.printf("%d ", value));
            System.out.println();

            // odd values greater than 11
            IntPredicate odd = value -> value % 2 != 0;
            IntPredicate greaterThan11 = value -> value > 11;

            System.out.printf("%nOdd values greater than 11" +
                " displayed in sorted order%n");
            IntStream.of(values)
                     .filter(odd.and(greaterThan11))
                     .sorted()
                     .forEach(value -> System.out.printf("%d ", value));
            System.out.println();

            // odd values multiplied by 10 and displayed in sorted order
            System.out.printf(
                "%nOdd values multiplied by 10 and displayed in sorted order:%n");
            IntStream.of(values)
                     .filter(value -> value % 2 != 0)
                     .map(value -> value * 10)
                     .sorted()
                     .forEach(value -> System.out.printf("%d ", value));
            System.out.println();

            // sum range of integers from 1 to 10, exclusive
            System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1, 10).sum());

            // sum range of integers from 1 to 10, inclusive
            System.out.printf("%nSum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());
      }
}
