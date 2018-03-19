public abstract class Employee implements Payable
{

       private final String firstName;
       private final String lastName;
       private final String socialSecurityNumber;

       public Employee(String firstName, String lastName,
            String socialSecurityNumber)
       {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
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

       @Override
       public String toString()
       {
            return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n",
                 "Employee",
                 "First Name", getFirstName(),
                 "Last Name", getLastName(),
                 "Social Security Number", getSocialSecurityNumber());
       }

       // We don't provide implementation for Payable method getPaymentAmount
       // so we must define the class with abstract keyword to avoid comp. error
}
