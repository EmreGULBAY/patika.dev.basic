import java.util.Scanner;

public class kdvHesaplama {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
	double tutar=scn.nextInt();
    double kdv=0;
    if(tutar>0&&tutar<=1000)
    kdv=0.18;
    else if(tutar>1000)
        kdv=0.8;

    double kdvli=tutar*kdv;
    double toplamTutar=tutar+kdvli;
        System.out.println("Kdvsiz tutarınız: "+tutar);
        System.out.println("Kdv oranınız: "+kdv);
        System.out.println("Kdv bedeliniz: "+kdvli);
        System.out.println("Toplam tutarınız: "+toplamTutar);
    }
}
