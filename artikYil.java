import java.util.Scanner;
public class artikYil {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        int yil=scn.nextInt();

        if(yil%100==0&&yil%400!=0)
            System.out.println(yil+" bir artık yıl değildir ! ");
         else if(yil%4==0)
            System.out.println(yil+" bir artık yıldır ! ");
        else if(yil%4>0)
            System.out.println(yil+" bir artık yıl değildir ! ");

    }

}
