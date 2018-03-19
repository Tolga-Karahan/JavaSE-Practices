public class HourlyEmployee extends Employee
{
      private double wagePerHour;
      private double hours;

      public HourlyEmployee(String fName, String lName,
           String socialSecurityNumber, double wagePerHour, double hours)
      {
             super(fName, lName, socialSecurityNumber);

             if(wagePerHour < 0.0)
                 throw new IllegalArgumentException(
                 "Wage-per-hour must be >= 0.0");

             if(hours < 0.0 || hours > 168.0)
                 throw new IllegalArgumentException(
                 "Hours must be between 0.0 and 168.0");

             this.wagePerHour = wagePerHour;
             this.hours = hours;
      }

      public void setWagePerHour(double wagePerHour)
      {
            this.wagePerHour = wagePerHour;
      }

      public double getWagePerHour()
      {
            if(wagePerHour < 0.0)
                throw new IllegalArgumentException(
                "Wage-per-hour must be >= 0.0");
            return wagePerHour;
      }

      public void setHours(double hours)
      {
            if(hours < 0.0 || hours > 168.0)
                throw new IllegalArgumentException(
                "Hours must be between 0.0 and 168.0");
            this.hours = hours;
      }

      public double getHours()
      {
            return hours;
      }

      public double earnings()
      {
            if(hours <= 40.0)
                return hours * wagePerHour;
            else
                return (40 * getWagePerHour() +
                    (hours - 40) * getWagePerHour() * 1.5);
      }

      public String toString()
      {
            return String.format("%s %s%s: %.2f%n%s: %.2f%n",
                "Hourly", super.toString(),
                "Wage per hour", getWagePerHour(),
                "Hours worked", getHours());
      }
}
