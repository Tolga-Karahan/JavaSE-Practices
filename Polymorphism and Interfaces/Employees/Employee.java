public abstract class Employee
{
       private String fName;
       private String lName;
       private String socialSecurityNumber;

       public Employee(String fName, String lName, String socialSecurityNumber)
       {
              this.fName = fName;
              this.lName = lName;
              this.socialSecurityNumber = socialSecurityNumber;
       }

       public String getFName()
       {
              return fName;
       }

       public String getLName()
       {
              return lName;
       }

       public String getSocialSecurityNumber()
       {
              return socialSecurityNumber;
       }

       public abstract double earnings();

       public String toString()
       {
              return String.format("%s%n%s: %s%n%s: %s%n",
              "Employee",
              "First name", getFName(),
              "Last name", getLName());
       }
}
