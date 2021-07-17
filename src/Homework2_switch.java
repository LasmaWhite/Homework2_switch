import java.util.Scanner;

public class Homework2_switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the operator: ");
        String string = scanner.next();
        char sign = string.charAt(0);

        scanner.close();

        // create two variables
        //int num1 = 100;
        //int num2 = 25;
        //char sign = '%';


        switch (sign) {
            case '+':
                System.out.println("The sum is " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case '/':
                System.out.println("The division is  " + (double)(num1 / num2));
                break;
            case '*':
                System.out.println("The multiplication is " + (num1 * num2));
                break;
            case '%':
                System.out.println("The remainder is " + (num1 % num2));
                break;
            case 'p':
                System.out.println("The entered numbers are " + num1 + " and " + num2);
                break;
            case 'b':
                if (num1>num2) {
                    System.out.println("Number 1 is bigger than Number 2");
                } else if (num2 > num1) {
                    System.out.println("Number 2 is bigger than Number 1");
                } else if (num1==num2) {
                    System.out.println("Both numbers are equal");
                }
                break;
            case 's':
                if (num1<num2) {
                    System.out.println("Number 1 is smaller than Number 2");
                } else if (num2 < num1) {
                    System.out.println("Number 2 is smaller than Number 1");
                } else if (num1==num2) {
                    System.out.println("Both numbers are equal");
                }
                break;
            default:
                System.out.println("Please try again - this operator is not valid.");





        }
    }
}
