import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format using if else and while loop.
 */


public class P01_MarkSheet {
    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name: ");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number: ");
        int rollNumber = scanner.nextInt();

        //Input mark for Maths
        int mathsMarks;
        do {
            System.out.println("Enter Marks of Subject Maths: ");
            mathsMarks = scanner.nextInt();
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("\nInvalid input, Marks should be between 0 to 100");
                System.out.println("Please enter correct marks: ");
            }
        } while (mathsMarks < 0 || mathsMarks > 100);
        //Input marks for Science
        int scienceMarks;
        do {
            System.out.println("Enter Marks of Subject Science ");
            scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("\nInvalid input, Marks should be 0 to 100");
                System.out.println("Please enter correct marks: ");
            }

        } while (scienceMarks < 0 || scienceMarks > 100);

        //input marks for English
        int englishMarks;
        do {
            System.out.println("Enter Marks of Subject English: ");
            englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("\nInvalid input, marks should be between 0 to 100");
                System.out.println("Please enter correct marks: ");
            }
        } while (englishMarks < 0 || englishMarks > 100);
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNumber, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //Closing the scanner object
        scanner.close();

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculating the result on subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    //Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, int total, int percentage, String result,
                                         String grade) {
        System.out.println("--------------------------------");
        System.out.println("|                               |");
        System.out.println("| Mark Sheet                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Name:" + name + "                    |");
        System.out.println("| Roll No:" + rollNum + "                     |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects: Marks               |");
        System.out.println("|_______________________________|");
        System.out.println("| Math:" + mathsMarks + "                       |");
        System.out.println("| Science:" + scienceMarks + "                    |");
        System.out.println("| English:" + englishMarks + "                    |");
        System.out.println("|_______________________________|");
        System.out.println("| Total:" + total + "                     |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage:" + percentage + "                 |");
        System.out.println("| Result:" + result + "                   |");
        System.out.println("| Grade:" + grade +   "                       |");
        System.out.println("|_______________________________|");
    }
}






