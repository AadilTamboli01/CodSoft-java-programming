import java.util.*;

public class StudentGradeCalculator {
    static class Calculator {
        Scanner sc = new Scanner(System.in);
        int Math, Science, Physics, History, Geography;

        void setMarks() {
            System.out.print("Enter Math Obtained Marks = ");
            Math = sc.nextInt();
            System.out.println();
            System.out.print("Enter Physics Obtained Marks = ");
            Physics = sc.nextInt();
            System.out.println();
            System.out.print("Enter Science Ontained Marks = ");
            Science = sc.nextInt();
            System.out.println();
            System.out.print("Enter History Obtained Marks = ");
            History = sc.nextInt();
            System.out.println();
            System.out.print("Enter Geography Obtained Marks = ");
            Geography = sc.nextInt();
            System.out.println();
            int Total = Math + Science + Physics + Geography + History;
            percentage(Total);
        }

        void percentage(int total) {

            System.out.println("your percentage is = " + total / 5);
            getGrade(total / 5);
        }

        void getGrade(float per) {
            if (per >= 80) {
                System.out.println("Congratulation you are passed with grade A ! ");

            } else if (per < 80 && per >= 60) {
                System.out.println("you are passed with Grade B ");

            } else if (per >= 35 && per < 60) {
                System.out.println("Your are passed with grade C ");
            } else {
                System.out.println("Oops ! You are fail ! ");
            }
        }

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setMarks();

    }

}
