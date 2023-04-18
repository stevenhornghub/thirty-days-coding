import java.util.Scanner;

public class Day6 {

    public static Scanner scanner = new Scanner(System.in);

    public void arrayString(String inputString) {
        char[] stringToCharArray = inputString.toCharArray();
        for (int i = 0; i < stringToCharArray.length; i++) {
            int evenWords = i;
            if (evenWords % 2 == 0) {
                System.out.print(stringToCharArray[i]);
            }
        }
        System.out.print(" ");
        for (int j = 0; j <stringToCharArray.length; j++) {
            int oddWords = j;
            if (oddWords % 2 != 0) {
                System.out.print(stringToCharArray[j]);
            }
        }
    }

    public static void main(String[] args) {
        int numberTestCases = scanner.nextInt();
        for (int i = 0; i < numberTestCases; i++) {
            String inputWords = scanner.nextLine();
            Day6 generate = new Day6();
            generate.arrayString(inputWords);
        }
    }
}
