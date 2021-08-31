import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int basamakSayisi = 0, rakam;
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scn.nextInt();
        int term = sayi;
        int term2 = sayi;

        while(term > 0) {
            term /= 10;
            basamakSayisi++;
        }
        while(sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, basamakSayisi);
            sayi /= 10;
        }
        if(toplam == term2) {
            System.out.println(term2 + " sayisi armstrong bir sayisidir.");
        }
        else {
            System.out.println(term2 + " sayisi armstrong bir sayisi degildir.");
        }
    }

}
