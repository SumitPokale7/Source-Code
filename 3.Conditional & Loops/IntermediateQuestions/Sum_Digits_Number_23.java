package IntermediateQuestions;

import java.util.Scanner;

// Q23. Sum Of A Digits Of Number

public class Sum_Digits_Number_23 {
    public static void main(String[] args) {

        System.out.println(SumDigits(5));
    }

    static int SumDigits(int n) {
        Scanner input = new Scanner(System.in);
        int Count = 0;
        for (int i = 0; i < n; i++) {
            int X = input.nextInt();
            Count += X;
        }
        input.close();
        return Count;
    }
}
