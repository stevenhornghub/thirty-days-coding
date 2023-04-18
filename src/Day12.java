public class Day12 {
    int[] scores;

   /* public Student(int[] scores, String firstName, String lastName, int id) {
        super(firstName, lastName, id);
        this.scores = scores;
    }*/

    public char calculate() {
        int average = 0;

        for (int i = 0; i < scores.length; i++) {
            average += scores[i];
        }
        average = average / scores.length;
        if (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average > 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}


