package CodingChallangeArrays;


import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayChallange {
    public static void main(String[] args) {

        int[] anarray = {0, 10, 14, 12, 5, 7, 9, 20, 26, 50};
        // Print out array in order
        System.out.println(Arrays.toString(anarray));

        // loop for geting reverse from the array
        for (int i = 0; i < 10 / 2; i++) {
            int temp = anarray[i];
            anarray[i] = anarray[10 - i - 1];
            anarray[10 - i - 1] = temp;
        }

        //Array print out reverse
        System.out.println(Arrays.toString(anarray));


        String[] MyName = {"Darrick", "Barry", "Emert", "Jamie", "Cantor"};
        System.out.println(Arrays.toString(MyName));

        int n = MyName.length;



        for (int j = 0; j < n/2; j ++){
            String temp = MyName[j];
            MyName[j] = MyName[n - j - 1];
            MyName[n - j- 1] = temp;
        }


        for (int i = 0; i < n; i++) {
            System.out.println(reverse(MyName[i]));{
                System.out.println(Arrays.toString(MyName));

            }
//            System.out.println(Arrays.toString(MyName));
        }
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = " ";
        int ptr = a.length() -1;
        while(ptr >= 0){
            b = b + a.charAt(ptr);
            ptr --;

        }
        System.out.println(b);





    }

    public static StringBuilder reverse(String MyName) {
        return new StringBuilder(new StringBuilder(MyName)
                .reverse()
                .toString());




    }
}







