import java.util.Scanner;
public class notOrtalaması {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int mat,fiz,kim,tur,tar,muz;
        System.out.println("Matematik notunu giriniz:");
         mat=scn.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fiz=scn.nextInt();
        System.out.println("Turkce notunu giriniz:");
        tur=scn.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kim=scn.nextInt();
        System.out.println("Tarih notunu giriniz:");
        tar=scn.nextInt();
        System.out.println("Muzik notunu giriniz:");
        muz=scn.nextInt();


        double sum=mat+fiz+kim+tur+tar+muz;
        double ortalama=sum/6;
        boolean durum=ortalama>=60;
        System.out.println("Ortalama:"+ortalama);
        System.out.println("Durum:"+ (durum==true ? "Gecti." : "Kaldı."));



    }
}
