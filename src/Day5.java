import java.util.Scanner;

public class Day5 {

    public static Scanner scanner = new Scanner(System.in);

    public void inputMultiplication(int number){
        for (int i = 0; i <=10; i++) {
            int item = i;
            int product = number * i;
            System.out.println(number+" x "+item+" = "+product);
        }
    }

    public static void main(String[] args) {
        Day5 calculate = new Day5();
        int inputNumber = scanner.nextInt();
        calculate.inputMultiplication(inputNumber);
    }
}
