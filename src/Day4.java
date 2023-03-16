import java.util.Scanner;

public class Day4 {

    private int age;
    public static String answer;
    public static Scanner scanner = new Scanner(System.in);

    public Day4(int initialAge){
        if(initialAge<0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to "+age);
        }else {
            this.age = initialAge;
        }
    }

    public void yearPasses(){
        this.age++;
    }

    public void amIOld(){
        if(age<=13){
            this.answer = "You are young";
        } else if (age>=13 && age<18) {
            this.answer = "You are teenager";
        } else {
            this.answer = "You are old";
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int numberTestCases = scanner.nextInt();
        for (int i = 0; i < numberTestCases; i++) {
            int inputAge = scanner.nextInt();
            Day4 person = new Day4(inputAge);
            person.amIOld();
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
            }
        scanner.close();
        }
    }


