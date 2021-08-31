import java.util.Scanner;
public class harmonik {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Değer giriniz : ");
        int sayi=scn.nextInt();
        double toplam=0.0;
        for(double i=1;i<=sayi;i++){
            toplam+=(1/i);
        }

        System.out.println("Sonuç : "+toplam);
    }

}
