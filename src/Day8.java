import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static  Map<String, Integer> phoneDictionary = new HashMap<String, Integer>();
    public static Scanner scanner = new Scanner(System.in);

    public static void  main(String[] args) {
        int inputNumberOfEntries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < inputNumberOfEntries; i++) {
            String phoneFirstName = scanner.next();
            int phoneNumber = scanner.nextInt();
            phoneDictionary.put(phoneFirstName, phoneNumber);
        }
        while (scanner.hasNext()) {
            String searchPhoneFirstName = scanner.next();
            if (phoneDictionary.containsKey(searchPhoneFirstName)) {
                System.out.println(searchPhoneFirstName + "=" + phoneDictionary.get(searchPhoneFirstName));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
