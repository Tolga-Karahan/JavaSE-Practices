public class App
{
      public static void main(String[] args)
      {

             Employee emp1 = new BasePlusCommissionEmployee(
                  "Tolga", "Karahan", "11-111-11", 150.0, .5, 300.0);
             Employee emp2 = new SalariedEmployee(
                  "Birtan", "Karahan","22-222-22", 3000.0);
             System.out.println(emp1);
             System.out.println(emp2);

      }
}
