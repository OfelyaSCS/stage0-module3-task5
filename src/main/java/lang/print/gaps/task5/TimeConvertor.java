package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    float seconds;
    public void convert(float minutes) {
        seconds=minutes*60;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter minutes ");
        float minutes=input.nextFloat();
        TimeConvertor result=new TimeConvertor();
        result.convert(minutes);
        System.out.println("Seconds: "+result.seconds);
    }
}
