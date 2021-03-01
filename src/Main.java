import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static int requestNumberFromUser(String message) {
        out.print(message);
        return in.nextInt();
    }

    /**
     * Esta función valida que un número dado se encuentra entre 5 y 300
     *
     * @param number
     * @return
     */

    public static boolean numberIsValid(int number) {
        return 5 <= number && number <= 300;
    }

    public static boolean isPrime(int number) {
        int divisor = 2;
        int squareRootOfNumber = (int) Math.sqrt(number);
        boolean isPrime = true;
        while (divisor <= squareRootOfNumber && isPrime) {
            if (number % divisor == 0) {
                isPrime = false;
            }
            divisor++;
        }
        return isPrime;
    }

    public static String createMessageForNumber(boolean isPrime, int number) {
        String message = "El número " + number;
        if (!isPrime) {
            message += " NO";
        }
        message += " es un número primo.";
        return message;
    }

    public static void main(String[] args) {

        int numberFromUser = requestNumberFromUser("Digite un número entre 5 - 300: ");

        if (numberIsValid(numberFromUser)) {

            out.println(createMessageForNumber(isPrime(numberFromUser), numberFromUser));

        } else {
            out.println("El número digitado no es valido.");
        }
    }
}


