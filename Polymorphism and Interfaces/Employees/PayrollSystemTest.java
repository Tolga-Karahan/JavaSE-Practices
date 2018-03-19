public class PayrollSystemTest
{
       public static void main(String[] args)
       {
             SalariedEmployee salariedEmployee =
                  new SalariedEmployee("Tolga", "Karahan", "11-111-11", 5000.0);
             HourlyEmployee hourlyEmployee =
                  new HourlyEmployee("Can", "Kaba", "22-222-22", 20.0, 50.0);
             CommissionEmployee commissionEmployee =
                  new CommissionEmployee("Selin", "Tokdemir", "33-333-33", 135.0, 3.5);
             BasePlusCommissionEmployee basePlusCommissionEmployee =
                  new BasePlusCommissionEmployee("Canan", "Demir", "44-444-44", 150.0, .5, 200.0);

             System.out.println("Employees processed individually:");

             System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
             System.out.printf("%n%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
             System.out.printf("%n%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
             System.out.printf("%n%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee, "earned",
                basePlusCommissionEmployee.earnings());

             Employee[] employees = new Employee[4];
             employees[0] = salariedEmployee;
             employees[1] = hourlyEmployee;
             employees[2] = commissionEmployee;
             employees[3] = basePlusCommissionEmployee;

              System.out.printf("Employees processed polymorphically:");

              for(Employee currentEmployee : employees)
              {
                   System.out.print(currentEmployee);

                   if(currentEmployee instanceof BasePlusCommissionEmployee)
                   {
                        BasePlusCommissionEmployee employee =
                              (BasePlusCommissionEmployee)currentEmployee;

                        employee.setBaseSalary(1.10 * employee.getBaseSalary());

                        System.out.printf(
                            "new base salary with %%10 increase is: %,.2f%n",
                            employee.getBaseSalary());

                   }

                   System.out.printf(
                       "earned %,.2f%n%n", currentEmployee.earnings());
              }

              for(int i = 0; i < employees.length; i++)
                   System.out.printf("Employee %d is a %s%n",
                   i, employees[i].getClass().getName());
       }
}
