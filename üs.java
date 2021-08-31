import java.util.Scanner;
public class üs {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int n=scn.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int r=scn.nextInt();
        int toplam=1;
        for(int i=0;i<r;i++){
            toplam*=n;

        }

        System.out.println("Sonuç : "+toplam);


    }

}
