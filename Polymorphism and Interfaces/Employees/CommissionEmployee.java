public class CommissionEmployee extends Employee
{
       private double grossSales;
       private double commissionRate;

       public CommissionEmployee(String fName, String lName,
            String socialSecurityNumber, double grossSales,
            double commissionRate)
      {
            super(fName, lName, socialSecurityNumber);

            if(grossSales < 0.0)
                 throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");
            if(commissionRate < 0.0)
                 throw new IllegalArgumentException(
                 "Commission rate must be >= 0.0");

            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
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
           if(commissionRate < 0.0)
                 throw new IllegalArgumentException(
                 "Commission rate must be >= 0.0");
           this.commissionRate = commissionRate;
      }

      public double getCommissionRate()
      {
           return commissionRate;
      }

      public double earnings()
      {
           return getGrossSales() * getCommissionRate();
      }

      public String toString()
      {
           return String.format("%s %s%s: %.2f%n%s: %.2f%n",
                "Commission", super.toString(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
      }
}
