import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                double num1, num2;

                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Addition.add(num1, num2));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Subtraction.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Multiplication.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Division.divide(num1, num2));
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + Square.square(num1));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + Cube.cube(num1));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + SquareRoot.sqrt(num1));
                        break;
                    case 8:
                        keepRunning = false;
                        System.out.println("Exiting calculator.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 8.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        scanner.close();
    }
}
