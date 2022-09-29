package lang.print.gaps.task5;

import java.util.Scanner;

public class NumberDivider {
    double number;
    void divide(int toBeDivided) {
        number=toBeDivided/5;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=input.nextInt();
        NumberDivider result=new NumberDivider();
        result.divide(number);
        System.out.println("Result number: "+result.number);
    }


}
