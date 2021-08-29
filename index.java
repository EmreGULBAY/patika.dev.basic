import java.util.Scanner;
public class index {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    double boy,kilo;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=scn.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=scn.nextDouble();

        double index= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndexiniz : "+index);

    }
}
