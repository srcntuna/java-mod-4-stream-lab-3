import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        // your code here
        return IntStream.rangeClosed(start,end).filter(x -> (x % a == 0) || (x % b == 0) ).sum();


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sumOfDivisors(start, end, a, b));

        scanner.close();
    }
}