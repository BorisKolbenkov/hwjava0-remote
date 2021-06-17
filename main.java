public class Main {
    public static void main(String[] args) {
        String number = "3535711838027741482";
        System.out.println(String.format("Result is %s", isValidCardNumber(number) ? "OK" : "FAIL"));
    }

    public static boolean isValidCardNumber(String number) {
        if (number == null) {
            return false;
        }

        if (number.length() != 16) {
            return false;
        }