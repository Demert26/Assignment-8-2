package Wednesday;

import java.util.Scanner;

public class GradeFlowControl {
    public static void main(String [] args) {
        Scanner scannerNum = new Scanner(System.in);

        System.out.print("Enter your grade for the class ");
        int grade = scannerNum.nextInt();

        int A = 90;
        int B = 80;
        int C = 70;
        int D = 60;



        if (grade >= A) {
            System.out.println("You get an A");
        }
        else if (grade >= B) {
            System.out.println("You get a B");
        }
        else if (grade >= C){
            System.out.println("You get a C");
        }
        else if (grade >= D){
            System.out.println("You get a D");
        }
        else {
            boolean b = grade < 60;
        } {
            System.out.println("You fail");
        }
    }
}


