import java.util.Scanner;

public class Day1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputInteger = scanner.nextInt();
        double inputDouble = scanner.nextDouble();

        int samOfIntAndDouble = (int) Math.abs(inputInteger + inputDouble);
        double samOfDouble = Math.round(inputDouble+inputDouble);
        scanner.nextLine();
        String inputString = scanner.nextLine();

        System.out.println(samOfIntAndDouble);
        System.out.println(samOfDouble);
        System.out.println("HackerRank "+inputString);


    }
}
