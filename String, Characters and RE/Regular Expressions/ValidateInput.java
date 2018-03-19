// Validating user information using regular expressions.
// This application is not designed to match all possible valid user input.
public class ValidateInput
{
        // validate first name
        public static boolean validateFirstName(String firstName)
        {
                return firstName.matches("[A-Z][a-zA-Z]*");
        }

        // validate last name
        public static boolean validateLastName(String lastName)
        {
                return lastName.matches("[a-zA-z] + (['-][a-zA-Z]+)*");
        }

        // validate adress
        public static boolean validateAdress(String adress)
        {
                return adress.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        }

        // validate city
        public static boolean validateCity(String city)
        {
                return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        }

        // validate state
        public static boolean validateState(String state)
        {
                return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
        }

        // validate zip
        public static boolean validateZip(String zip)
        {
                return zip.matches("\\d{5}");
        }

        // validate phone
        public static boolean validatePhone(String phone)
        {
                return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
        }

}
