import java.util.Scanner;
public class desen {


    static int desen(int num) {
        System.out.print(num + " ");
        if (num <= 0) {
            return num;
        }
        int tempNum = desen(num - 5) + 5;

        System.out.print(tempNum + " ");

        return tempNum;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        desen(16);

    }
}
