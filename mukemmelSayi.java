import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi=scn.nextInt();
        int toplam =0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0)
            toplam+=i;
        }
	if(toplam==sayi)
        System.out.println("Sayı mükemmel sayıdır!");
	else
        System.out.println("Sayı mükkemmel sayı değildir!");

    }
}
