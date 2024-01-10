import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numerical grade: ");
        int numericalGrade = scanner.nextInt();

        char letterGrade = calculateLetterGrade(numericalGrade);

        System.out.println("Your letter grade is: " + letterGrade);

        scanner.close();
    }

    private static char calculateLetterGrade(int numericalGrade) {
        char letterGrade;

        if (numericalGrade >= 90 && numericalGrade <= 100) {
            letterGrade = 'A';
        } else if (numericalGrade >= 80 && numericalGrade < 90) {
            letterGrade = 'B';
        } else if (numericalGrade >= 70 && numericalGrade < 80) {
            letterGrade = 'C';
        } else if (numericalGrade >= 60 && numericalGrade < 70) {
            letterGrade = 'D';
        } else if (numericalGrade >= 50 && numericalGrade < 60) {
            letterGrade = 'E';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
