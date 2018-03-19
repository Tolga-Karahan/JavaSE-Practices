// enum type for the credit-inquiry program's options.
public enum MenuOption
{
       // declare contents of enum type
       ZERO_BALANCE(1),
       CREDIT_BALANCE(2),
       DEBIT_BALANCE(3),
       END(4);

       private final int value;

       private MenuOption(int value)
       {
              this.value = value;
       }
}
