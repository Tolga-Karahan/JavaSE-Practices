public class SalariedEmployee extends Employee
{
       private double weeklySalary;

       public SalariedEmployee(String firstName, String lastName,
       String socialSecurityNumber, double weeklySalary)
       {
             super(firstName, lastName, socialSecurityNumber);
             if(weeklySalary < 0.0)
                throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
             this.weeklySalary = weeklySalary;
       }

       public void setWeeklySalary(double weeklySalary)
       {
             if(weeklySalary < 0.0)
                throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
             this.weeklySalary = weeklySalary;
       }

       public double getWeeklySalary()
       {
             return weeklySalary;
       }

       @Override
       public String toString()
       {
             return String.format("%s %s%s: $%,.2f%n",
                  "Salaried", super.toString(),
                  "Weekly Salary", getWeeklySalary());
       }

       @Override
       public double getPaymentAmount()
       {
             return getWeeklySalary();
       }
}
