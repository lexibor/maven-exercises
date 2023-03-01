import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class GuavaTest
{
    public static void main(String[] args)
    {
//        String output = Strings.padEnd("cat", 10, '*');
//        System.out.println(output);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.printf("You entered: \"%s\"%n", userInput);



        if(!StringUtils.isNumeric(userInput))
        {
            System.out.printf("\"%s\" is NOT a number%n", userInput);
        }
        else
        {
            System.out.printf("\"%s\" is a number%n", userInput);
        }

        System.out.printf("Flipped case: %s%n", StringUtils.swapCase(userInput));

        System.out.printf("Reversed: %s", StringUtils.reverse(userInput));




    }
}
