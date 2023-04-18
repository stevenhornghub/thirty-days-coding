import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Day11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowArray = 6;
        int colArray = 6;
        int[][] boxArray = new int[rowArray][colArray];
        for (int i = 0; i < rowArray; i++) {
            for (int j = 0; j < colArray; j++) {
                boxArray[i][j] = scanner.nextInt();
            }
        }
        int max = -9 * 6;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = boxArray[i][j] + boxArray[i][j + 1] + boxArray[i][j + 2];
                sum += boxArray[i + 1][j + 1];
                sum += boxArray[i + 2][j] + boxArray[i + 2][j + 1] + boxArray[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}