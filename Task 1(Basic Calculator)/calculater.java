import java.util.*;

public class calculater {
    private double num1;
    private double num2;
    private Scanner sc = new Scanner(System.in);

    // Method to get numbers from user
    public void getNumbers() {
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
    }

    // Addition operation
    public void addition() {
        System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    // Subtraction operation
    public void subtraction() {
        System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    // Multiplication operation
    public void multiplication() {
        System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
    }

    // Division operation
    public void division() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    // Display menu
    public void displayMenu() {
        System.out.println("\n========== CALCULATOR ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Choose an operation (1-5): ");
    }

    public static void main(String[] args) {
        calculater calc = new calculater();
        int choice;

        System.out.println("Welcome to Simple Calculator!");

        while (true) {
            calc.displayMenu();
            choice = calc.sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Calculator. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                calc.getNumbers();

                switch (choice) {
                    case 1:
                        calc.addition();
                        break;
                    case 2:
                        calc.subtraction();
                        break;
                    case 3:
                        calc.multiplication();
                        break;
                    case 4:
                        calc.division();
                        break;
                    
                }
            } else {
                System.out.println("Invalid choice! Please select between 1-5.");
            }
        }

        // calc.sc.close();
    }
}
