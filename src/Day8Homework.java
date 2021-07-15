import java.util.Scanner;

public class Day8Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number:");
        double numA = scanner.nextDouble();
        System.out.println("Please input second number:");
        double numB = scanner.nextDouble();
        System.out.println("Please input character from the list : +,-,/,*,%,p,b,s");
        char userOption = scanner.next().charAt(0);

        switch (userOption) {
            case '+':
                System.out.println("The sum of both numbers is: " + (numA + numB));
                break;
            case '-':
                System.out.println("The difference between the two numbers is: " + (numA - numB));
                break;
            case '/':
                System.out.println("The division of both numbers is: " + (numA / numB));
                break;
            case '*':
                System.out.println("The multiplication of both numbers is: " + (numA * numB));
                break;
            case '%':
                System.out.println("The remainder when the first element is divided by the second element is: " + numA % numB);
                break;
            case 'p':
                System.out.println("The first number is: " + numA + " ; the second number is: " + numB);
                break;
            case 'b':
                System.out.println("The largest number of the two numbers is:" + (Math.max(numA, numB)));
                break;
            case 's':
                System.out.println("The smallest number of the two numbers is:" + (Math.min(numA, numB)));
                break;
            default:
                System.out.println("There is no such character");

        }
    }
}
