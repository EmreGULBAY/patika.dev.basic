import java.util.Scanner;
public class kucuktenBuyuge {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        double sayi1=scn.nextDouble();
        System.out.println("2. sayıyı giriniz : ");
        double sayi2=scn.nextDouble();
        System.out.println("3. sayıyı giriniz : ");
        double sayi3=scn.nextDouble();

        if(sayi1<sayi2&&sayi1<sayi3){
            if(sayi2<sayi3)
                System.out.println("sayi1<sayi2<sayi3");
            else
                System.out.println("sayi1<sayi3<sayi2");
        }
        else if(sayi2<sayi1&&sayi2<sayi3){
            if(sayi1<sayi3)
                System.out.println("sayi2<sayi1<sayi3");
            else
                System.out.println("sayi2<sayi3<sayi1");
        }
        else if(sayi3<sayi2&&sayi3<sayi1){
            if(sayi2<sayi1)
                System.out.println("sayi3<sayi2<sayi1");
            else
                System.out.println("sayi3<sayi1<sayi2");
        }
    }
}
