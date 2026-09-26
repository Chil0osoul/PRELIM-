import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WEEK_5_ACTIVITY_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(reader);

        System.out.print("Enter first word: ");
        String firstWord = scanner.next();

        System.out.print("Enter second word: ");
        String secondWord = scanner.next();

        System.out.print("Enter third word: ");
        String thirdWord = scanner.next();

        System.out.println(firstWord + " " + secondWord + " " + thirdWord);
    }
}
