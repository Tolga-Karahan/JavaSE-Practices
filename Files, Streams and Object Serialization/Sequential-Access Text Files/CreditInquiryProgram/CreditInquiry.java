// This program reads a file sequentially and displays the
// contents based on the type of account the user requests
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry
{
       private final static MenuOption[] options = MenuOption.values();

       public static void main(String[] args)
       {
              MenuOption accountType = getRequest();

              while(accountType != MenuOption.END)
              {
                     switch(accountType)
                     {
                            case ZERO_BALANCE:
                                  System.out.printf(
                                  "%nAccounts with zero balances:%n");
                                  break;
                            case CREDIT_BALANCE:
                                  System.out.printf(
                                  "%nAccounts with credit balances:%n");
                                  break;
                            case DEBIT_BALANCE:
                                  System.out.printf(
                                  "%nAccounts with debit balances:%n");
                                  break;
                     }

                     readRecords(accountType);
                     accountType = getRequest();
              }
       }

       public static MenuOption getRequest()
       {
              int request = 4;

              System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                     "1 - List accounts with zero balances",
                     "2 - List accounts with credit balances",
                     "3 - List accounts with debit balances",
                     "4 - Terminate program");

              try
              {
                     Scanner input = new Scanner(System.in);
                     do
                     {
                            System.out.printf("%n?");
                            request = input.nextInt();
                     } while (request < 1 || request > 4);
              }
              catch(NoSuchElementException noSuchElementException)
              {
                     System.err.println("Invalid input. Terminating.");
              } 
              return options[request - 1];
       }

       public static void readRecords(MenuOption accountType)
       {
              try(Scanner input = new Scanner(Paths.get("clients.txt")))
              {
                     while(input.hasNext())
                     {
                            int accountNumber = input.nextInt();
                            String firstName = input.next();
                            String lastName = input.next();
                            Double balance = input.nextDouble();

                            if(shouldDisplay(accountType, balance))
                            {
                                   System.out.printf("%-10d%-12s%-12s%-10.2f%n",
                                        accountNumber, firstName,
                                        lastName, balance);
                            }
                     }
              }
              catch(NoSuchElementException |
                   IOException | IllegalStateException e)
              {
                     System.err.println("Error processing file. Terminating.");
                     System.exit(1);
              }
       }

       public static boolean shouldDisplay(MenuOption accountType, Double balance)
       {
              if(accountType == MenuOption.ZERO_BALANCE && balance == 0)
                    return true;
              else if(accountType == MenuOption.CREDIT_BALANCE && balance < 0)
                    return true;
              else if(accountType == MenuOption.DEBIT_BALANCE && balance > 0)
                    return true;
              else
                    return false;
       }
}
