import java.util.Scanner;

public class Day3 {

    public static Scanner scanner = new Scanner(System.in);

    public void inputNumber(int number) {
        if (number % 2 == 1) {
            System.out.println("Weird");
        } else if (number >= 6 && number <= 20) {
            System.out.println("Weird");
        }else {
            System.out.println("Unable to Identify");
        }
    }

    public static void main(String[] args) {
        Day3 identify = new Day3();
        int inputNumber = scanner.nextInt();
        identify.inputNumber(inputNumber);
    }

}
