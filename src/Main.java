import java.lang.*;
import java.util.Scanner;

public class Main {
    private static int i;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        i = in.nextInt()*10;
        out(i / 10);
        System.out.println();
        reverse(i / 10);
    }
    //тут у нас 14-ый номер
    private static void out(int i) {
        if(i>0) {
            out(i / 10);
            System.out.print(" ");
            System.out.print(i % 10);
        }
    }
    //тут у нас 15-ый номер
    private static void reverse(int i) {
        if(i>0) {
            System.out.print(" ");
            System.out.print(i % 10);
            reverse(i / 10);
        }
    }
}
