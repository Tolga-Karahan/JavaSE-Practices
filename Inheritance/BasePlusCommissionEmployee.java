// BasePlusCommissionEmployee class represents an employee who receives
// a base salary in addition to commission.

public class BasePlusCommissionEmployee
{
       private final String firstName;
       private final String lastName;
       private final String socialSecurityNumber;
       private double grossSales;
       private double commissionRate;
       private double baseSalary;

       public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary)
       {

            if(grossSales < 0.0)
                throw new IllegalArgumentException(
                   "Gross sales must be >= 0");

            if(commissionRate <= 0.0 && commissionRate >= 1.0)
                throw new IllegalArgumentException(
                   "Commission rate must be " +
                   "between 0.0 and 1.0");

            if(baseSalary < 0.0)
                throw new IllegalArgumentException(
                   "Base salary must be >= 0.0");


            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
            this.baseSalary = baseSalary;
       }

      public String getFirstName()
      {
            return firstName;
      }

      public String getLastName()
      {
            return lastName;
      }

      public String getSocicalSecurityNumber()
      {
            return socialSecurityNumber;
      }

      public void setGrossSales(double grossSales)
      {
            if(grossSales < 0.0)
                throw new IllegalArgumentException(
                     "Gross sales must be >= 0.0");

            this.grossSales = grossSales;
      }

      public double getGrossSales()
      {
            return grossSales;
      }

      public void setCommissionRate(double commissionRate)
      {
            if(commissionRate <= 0.0 && commissionRate >= 1.0)
                throw new IllegalArgumentException(
                     "Commission rate must be " +
                     "between 0.0 and 1.0");

            this.commissionRate = commissionRate;
      }

     public double getCommissionRate()
     {
            return commissionRate;
     }



      public void setBaseSalary(double baseSalary)
      {
            if(baseSalary < 0.0)
                throw new IllegalArgumentException(
                    "Base salary must be >= 0");

            this.baseSalary = baseSalary;
      }

      public double getBaseSalary()
      {
            return baseSalary;
      }


      public double earnings()
      {
            return baseSalary + (grossSales * commissionRate);
      }

      @Override
      public String toString()
      {
           return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s:%.2f%n%s%.2f",
                "Base-salaried commission employee",
                 getFirstName(),
                 getLastName(),
                 "Social Security Number: ", getSocicalSecurityNumber(),
                 "Gross sales", getGrossSales(),
                 "Commission rate", getCommissionRate(),
                 "Base salary", getBaseSalary());
      }
}
