// Tests CommissionEmployee class
public class CommissionEmployeeTest
{
      public static void main(String[] args)
      {
            CommissionEmployee employee = new CommissionEmployee(
                 "Sue", "Jones", "222-22-2222", 10000, .06);

            System.out.println("Employee information obtained by get methods:");

            System.out.printf("%n%s: %s%n", "First Name",
                 employee.getFirstName());
            System.out.printf("%s: %s%n", "Last Name",
                 employee.getLastName());
            System.out.printf("%s: %s%n", "Social Security Number",
                 employee.getSocialSecurityNumber());
            System.out.printf("%s: %.2f%n", "Gross sales",
                 employee.getGrossSales());
            System.out.printf("%s: %.2f%n", "Commission rate",
                 employee.getCommissionRate());

            employee.setGrossSales(5000);
            employee.setCommissionRate(.1);

            System.out.println("\nUpdated employee information " +
                 "obtained by toString:");

            System.out.printf("%n%s%n", employee);

      }
}
