import java.util.*;

    public class WEEK_5_ACTIVITY_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter First Number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter Second Number: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Enter Third Number: ");
            int thirdNumber = scanner.nextInt();

            if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                System.out.println("The highest number is: " + firstNumber);
            } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println("The highest number is: " + secondNumber);
            } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
                System.out.println("The highest number is: " + thirdNumber);
            } else {
                System.out.println("There is a tie for the highest number.");
            }
    }}