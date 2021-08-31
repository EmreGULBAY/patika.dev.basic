import java.util.Scanner;
public class dortBes {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi=scn.nextInt();
        for(int i=1;i<=sayi;i++){
            if(i%4==0)
                System.out.println(i);
            if(i%5==0)
                System.out.println(i);

        }

    }

}
