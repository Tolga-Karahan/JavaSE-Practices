// Input and validate date from user using the ValidateInput class.
import java.util.Scanner;

public class Validate
{
       public static void main(String[] args)
       {
              // get user inputs
              Scanner scanner = new Scanner(System.in);
              System.out.println("Please enter first name:");
              String firstName = scanner.nextLine();
              System.out.println("Please enter last name:");
              String lastName = scanner.nextLine();
              System.out.println("Please enter address:");
              String address = scanner.nextLine();
              System.out.println("Please enter city:");
              String city = scanner.nextLine();
              System.out.println("Please enter state:");
              String state = scanner.nextLine();
              System.out.println("Please enter zip:");
              String zip = scanner.nextLine();
              System.out.println("Please enter phone:");
              String phone = scanner.nextLine();

              // validate user input and display error message
              System.out.println("%nValidate Result:");

              if(!ValidateInput.validateFirstName(firstName))
                  System.out.println("Invalid first name");
              else if(!ValidateInput.validateLastName(lastName))
                  System.out.println("Invalid last name");
              else if(!ValidateInput.validateAdress(address))
                  System.out.println("Invalid address");
              else if(!ValidateInput.validateCity(city))
                  System.out.println("Invalid city");
              else if(!ValidateInput.validateState(state))
                  System.out.println("Invalid state");
              else if(!ValidateInput.validateZip(zip))
                  System.out.println("Invalid zip");
              else if(!ValidateInput.validatePhone(phone))
                  System.out.println("Invalid phone");
              else
                  System.out.println("Valid input. Thank you.");                    

       }
}
