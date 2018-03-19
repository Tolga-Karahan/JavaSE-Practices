public class BasePlusCommissionEmployee extends CommissionEmployee
{
       private double baseSalary;

       public BasePlusCommissionEmployee(String fName, String lName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary)
       {
             super(fName, lName, socialSecurityNumber,
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
             this.baseSalary = baseSalary;
       }

       public double getBaseSalary()
       {
             return baseSalary;
       }

       public double earnings()
       {
             return getBaseSalary() + super.earnings();
       }

       public String toString()
       {
             return String.format("%s %s%s: %.2f%n",
                 "Base-salaried", super.toString(),
                 "Base salary", getBaseSalary());
       }
}
