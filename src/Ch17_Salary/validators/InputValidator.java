package Ch17_Salary.validators;

public class InputValidator {
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isPositiveInt(int number) {
        return number > 0;
    }

    public static boolean isValidInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
