public class SalariedEmployee extends Employee
{
        private double weeklySalary;

        public SalariedEmployee(String fName, String lName,
             String socialSecurityNumber, double weeklySalary)
        {
               super(fName, lName, socialSecurityNumber);

               if(weeklySalary < 0.0)
                    throw new IllegalArgumentException(
                    "Salary must be >= 0.0");
               this.weeklySalary = weeklySalary;
        }

        public void setSalary(double salary)
        {
              if(salary < 0.0)
                   throw new IllegalArgumentException(
                   "Salary must be >= 0.0");
              this.weeklySalary = weeklySalary;
        }

        public double getSalary()
        {
              return weeklySalary;
        }

        public double earnings()
        {
              return weeklySalary;
        }

        public String toString()
        {
              return String.format("%s %s%s: %.2f%n",
                   "Salaried", super.toString(),
                   "Weekly salary", getSalary());
        }

}
