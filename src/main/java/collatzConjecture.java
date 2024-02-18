import java.util.Scanner;
class CollatzConjecture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int startingNumber = scanner.nextInt();
        printCollatzSequence(startingNumber);
    }

    public static void printCollatzSequence(int number) {
        System.out.println("Starting number: " + number);
        int steps=0;
        while (number != 1) {
            if (isEven(number)) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            System.out.println(number);
            steps++;
        }
        System.out.println("Terminated after "+steps+" step.");
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}