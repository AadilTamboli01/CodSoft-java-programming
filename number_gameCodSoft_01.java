import java.util.*;

public class Number_game {

    public static void generateRandom(int range) {
        Scanner sc = new Scanner(System.in);

        System.out.println("your have 5 chance to guess the number which will be printed ! lets do it ...");
        int count = -1;
        int n = 5;

        for (int i = 0; i < 5; i++) {
            int currNo = (int) (Math.random() * range);

            System.out.print("Predict the  number will be printed  = ");
            int number = sc.nextInt();
            count++;
            int Score = ((n - count) / n) * 100;
            if (number == currNo) {
                System.out.println("Congratulations You win ! ");

                System.out.println("\n And your Score is = " + Score);

            } else if ((number < currNo)) {
                System.out.println("your no is Small  ! ");

            } else {
                System.out.println(" Your no is Big  ! ");

            }

            System.out.println("the number generated  by Computer is = " + currNo);

            if (i == 4) {
                System.out.println("your score is = " + Score);
                System.out.println("Better Luck Next Time ! ");
                System.out.println();

                System.out.println("Enter 1 if you want to play again either enter 0 !  = ");
                int wantTo = sc.nextInt();

                if (wantTo == 1) {
                    i = 0;

                } else {
                    return;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        generateRandom(100);
    }
}
