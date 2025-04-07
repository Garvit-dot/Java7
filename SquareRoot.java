public class SquareRoot {
    // Method to calculate square root with exception handling
    public static double sqrt(double a) {
        try {
            if (a < 0) {
                throw new ArithmeticException("Cannot find square root of negative number.");
            }
            return Math.sqrt(a);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}
