import java.util.Scanner;

public class Day2 {

    public static Scanner scanner = new Scanner(System.in);

    public void solve(double mealCost, int tipPercent, int taxPercent) {
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println(totalCost);
    }

    public static void main(String[] args) {
        Day2 calculate = new Day2();
        double mealCost = scanner.nextDouble();
        int tipPercent = scanner.nextInt();
        int taxPercent = scanner.nextInt();
        calculate.solve(mealCost, tipPercent, taxPercent);

    }
}
