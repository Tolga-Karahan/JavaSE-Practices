public class BasePlusCommissionEmployeeTest
{
      public static void main(String[] args)
      {
            BasePlusCommissionEmployee3 employee =
                 new BasePlusCommissionEmployee3("Bob", "Lewis", "333 - 33 - 3333",
                      5000, .04, 300);

            System.out.println("Employee information obtained by get methods:\n");

            System.out.printf("%s: %s%n", "First Name",
                 employee.getFirstName());
            System.out.printf("%s: %s%n", "Last Name",
                 employee.getLastName());
            System.out.printf("%s: %s%n", "Social Security Number",
                 employee.getSocialSecurityNumber());
            System.out.printf("%s: %.2f%n", "Gross Sales",
                 employee.getGrossSales());
            System.out.printf("%s: %.2f%n", "Commission Rate",
                 employee.getCommissionRate());
            System.out.printf("%s: %.2f%n%n%n", "Base Salary",
                 employee.getBaseSalary());

            employee.setBaseSalary(1000);

            System.out.printf("%s:%n%n%s",
                 "Updated employee information obtained by toString",
                 employee);
            System.out.printf("%nEarnings of the person is: %.2f",
                 employee.earnings());
      }

}
