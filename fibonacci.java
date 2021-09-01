import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Kaç basamak yazılsın ? : ");
        int sayi=scn.nextInt();
        int a=1;
        int b=0;
        int toplam;
        toplam=a+b;
        for(int i=1;i<=sayi;i++){
            a=b;
            b=toplam;
            toplam=a+b;
            System.out.println(a+" + "+b+" = "+(toplam));
        }
    }
}
