import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class main {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a String :");
        String userInput = input.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput+" This is a number");
        } else
        {
            System.out.println(userInput+" This is not a number");
        }

        System.out.println("Flipping the case -> "+StringUtils.swapCase(userInput));
        System.out.println("Flipping the case -> "+StringUtils.reverse(userInput));
    }

}
