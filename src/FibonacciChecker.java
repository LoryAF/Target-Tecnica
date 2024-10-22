import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.", number);
        }else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.", number);
        }

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}