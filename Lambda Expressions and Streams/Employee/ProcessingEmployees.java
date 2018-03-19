// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees
{
      public static void main(String[] args)
      {
            Employee[] employees = {
               new Employee("Jason", "Red", 5000, "IT"),
               new Employee("Ashley", "Green", 7600, "IT"),
               new Employee("Matthew", "Indigo", 3587.5, "Sales"),
               new Employee("James", "Indigo", 4700.77, "Marketing"),
               new Employee("Luke", "Indigo", 6200, "IT"),
               new Employee("Jason", "Blue", 3200, "Sales"),
               new Employee("Wendy", "Brown", 4236.4, "Marketing")};

            List<Employee> list = Arrays.asList(employees);

            // display all employees
            System.out.println("Complete Employee List:");
            list.stream()
                    .forEach(System.out::println);

            // Predicate that return true for salaries in range $4000-$6000
            Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

            // Display employees with salaries in the range $4000-$6000
            // sorted into ascending order by salary
            System.out.println("\nEmployees earning $4000-$6000 per month " +
                "sorted by salary:");
            list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

            // Display first employee with salary in the range $4000-$6000
            System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                    .filter(fourToSixThousand)
                    .findFirst()
                    .get());

            // Functions for getting first and last names from an Employee
            Function<Employee, String> byFirstName = Employee::getFirstName;
            Function<Employee, String> byLastName = Employee::getLastName;

            // Comparator for comparing Employees by last name then first name
            Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

            // sort employees in ascending order by last name, then first name
            System.out.println(
                "\nEmployees in ascending order by last name then first name:");
            list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

            // sort employees in descending order by last name, then first name
            System.out.println(
                "\nEmployees in descending order by last name then first name:");
            list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

            // display unique Employee last names sorted
            System.out.println("\nUnique employee last names:");
            list.stream()
                .map(Employee::getLastName)
                .distinct()
                .forEach(System.out::println);

            // display only first and last names
            System.out.println(
               "\nEmployee names in order by last name then fist name:");
            list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

            // group Employees by department
            System.out.println("\nEmployees by department:");
            Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

            groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.printf("Employees in %s Department:%n", department);
                    employeesInDepartment.forEach(
                        employee -> System.out.printf("\t%s%n", employee));
                }
            );

            // count number of Employees in each department
            System.out.println("\nCount of Employees by department:");
            System.out.printf("%-15s%-5s%n", "Department", "Count");
            Map<String, Long> countEmployeesByDepartment =
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));

           countEmployeesByDepartment.forEach(
                (department, count) -> System.out.printf("%-15s%-2d%n",
                department, count)
           );

           // sum of Employees via DoubleStream's sum method
           System.out.printf(
               "\nSum of Employees' salaries (via sum method): %.2f%n",
               list.stream()
                   .mapToDouble(Employee::getSalary)
                   .sum()
           );

           // calculate sum of Employee salaries with Stream's reduce method
           System.out.printf(
               "Sum of Employes' salaries (via reduce method): %.2f%n",
               list.stream()
                   .mapToDouble(Employee::getSalary)
                   .reduce(0, (value1, value2) -> value1 + value2)
           );

           // calculate average of Employee salaries with DoubleStream's average
           System.out.printf(
               "Average of Employees' salaries: %.2f",
               list.stream()
                   .mapToDouble(Employee::getSalary)
                   .average()
                   .getAsDouble()
           );
      }
}
