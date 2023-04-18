import java.util.Scanner;

public class Day7 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int index = i;
            intArray[index] = scanner.nextInt();
        }
        scanner.close();
        for (int j = arraySize; j >= 0 ; j--) {
            int reverseIndex = j;
            if (reverseIndex < intArray.length){
                System.out.print(intArray[reverseIndex] + " ");
            }
        }
    }
}
