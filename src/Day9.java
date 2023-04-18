import java.util.Scanner;

public class Day9 {

    public static Scanner scanner = new Scanner(System.in);

    public static int factorial(int number){
        if(number<=0){
            return 1;
        } else {
            return number * factorial(number-1);
        }
    }

    public static void main(String[] args) {
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println(result);


    }
}
