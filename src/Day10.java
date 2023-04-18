import java.util.Scanner;

public class Day10 {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.close();

        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0;
        int maxCount = 0;
        for (int i = 0; i<binary.length; i++){
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
            if(tmpCount>maxCount){
                maxCount = tmpCount;
        }
        }
        System.out.println(maxCount);
    }
}
