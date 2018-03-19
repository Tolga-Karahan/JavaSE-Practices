public class BasePlusCommissionEmployee3 extends CommissionEmployee
{
       double baseSalary;

       public BasePlusCommissionEmployee3(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary)
       {
              super(firstName, lastName, socialSecurityNumber,
                  grossSales, commissionRate);

              if(baseSalary < 0.0)
                  throw new IllegalArgumentException(
                      "Base salary must be >= 0.0");

              this.baseSalary = baseSalary;
       }

       public void setBaseSalary(double baseSalary)
       {
              if(baseSalary < 0.0)
                  throw new IllegalArgumentException(
                      "Base salary must be >= 0.0");
       }

       public double getBaseSalary()
       {
              return baseSalary;
       }

       public double earnings()
       {
              return baseSalary + super.earnings();
       }

       public String toString()
       {
              return String.format("%s %s%n%s: %.2f",
                  "Base-salaried ", super.toString(),
                  "Base Salary", getBaseSalary());
       }
}
