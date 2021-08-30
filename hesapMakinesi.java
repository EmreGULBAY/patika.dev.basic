import java.util.Scanner;
public class hesapMakinesi {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        double sayi1,sayi2;
        System.out.println("1. sayiyi giriniz: ");
        sayi1=scn.nextDouble();
        System.out.println("2. sayiyi giriniz: ");
        sayi2=scn.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        int seçim =scn.nextInt();
        switch(seçim){

            case 1:
                System.out.println("Toplam: "+(sayi1+sayi2));
                break;
            case 2:
                    System.out.println("Fark: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0)
                    System.out.println("Bölme işleminde payda 0 olamaz!");
                else
                System.out.println("Bölüm: "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Lütfen geçerli sayı giriniz!");
                break;
        }




    }
}
