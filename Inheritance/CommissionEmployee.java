// CommissionEmployee class represents an employee paid a
// percentage of gross sales.

public class CommissionEmployee extends Object
{
      private final String firstName;
      private final String lastName;
      private final String socialSecurityNumber;
      private double grossSales;
      private double commissionRate;

      public CommissionEmployee(String firstName, String lastName,
          String socialSecurityNumber, double grossSales, double commissionRate)
          {

                //implicit call to Object's default constructor occurs here

                //if grossSales is invalid throw exception
                if(grossSales < 0.0)
                    throw new IllegalArgumentException("Gross sales must be " +
                         ">= 0.0");

                //if commissionRate is invalid throw exception
                if(commissionRate <= 0.0 && commissionRate >= 1.0)
                    throw new IllegalArgumentException("Commission rate must be" +
                         " between 0.0 and 1.0");

                this.firstName = firstName;
                this.lastName = lastName;
                this.socialSecurityNumber = socialSecurityNumber;
                this.grossSales = grossSales;
                this.commissionRate = commissionRate;
          }

          public String getFirstName()
          {
                return firstName;
          }

          public String getLastName()
          {
               return lastName;
          }

          public String getSocialSecurityNumber()
          {
               return socialSecurityNumber;
          }

          public void setGrossSales(double grossSales)
          {
               if(grossSales < 0.0)
                   throw new IllegalArgumentException("Gross sales must be" +
                        " >= 0.0");

                this.grossSales = grossSales;
          }

          public double getGrossSales()
          {
               return grossSales;
          }

          public void setCommissionRate(double commissionRate)
          {
               if(commissionRate <= 0.0 && commissionRate >= 1.0)
                    throw new IllegalArgumentException("Commission rate must be" +
                         " between 0.0 and 1.0");

                this.commissionRate = commissionRate;
          }

          public double getCommissionRate()
          {
                return commissionRate;
          }

          public double earnings()
          {
               return grossSales * commissionRate;
          }


          // return String representation of CommissionEmployee Object
          @Override // indicates that this method overrides a superclass method
          public String toString()
          {
              return String.format("%s:%n%s%n%s%n%s%s%n%s%.2f%n%s%.2f%n",
                     "Commission Employee",
                     getFirstName(),
                     getLastName(),
                     "Social Security Number: ", getSocialSecurityNumber(),
                     "Gross sales: ", getGrossSales(),
                     "Commission rate: ", getCommissionRate());
          }


}
