import java.util.Scanner;
public class gecmeDurumu {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Matematik notunu giriniz : ");
        double mat=scn.nextDouble();
        if(mat<0||mat>100)
            mat=0;
        System.out.println("Fiziknotunu giriniz : ");
        double fiz=scn.nextDouble();
        if(fiz<0||fiz>100)
            fiz=0;
        System.out.println("Türkçe notunu giriniz : ");
        double tur=scn.nextDouble();
        if(tur<0||tur>100)
            tur=0;
        System.out.println("Kimya notunu giriniz : ");
        double kim=scn.nextDouble();
        if(kim<0||kim>100)
            kim=0;
        System.out.println("Müzik notunu giriniz : ");
        double muz=scn.nextDouble();
        if(muz<0||muz>100)
            muz=0;
        double average =(mat+fiz+tur+kim+muz)/5;

        if(average>55)
            System.out.println("Geçtiniz!");
        else
            System.out.println("Kaldınız!");
        System.out.println("Ortalamanız : "+average);

    }
}
