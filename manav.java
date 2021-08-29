import java.util.Scanner;
public class manav {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    double A = 2.14 ;
    double E = 3.67;
    double D= 1.11;
    double M = 0.95;
    double P = 5.00;
        System.out.println("Armut Kaç Kilo ? :");
        double a=scn.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        double e=scn.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        double d=scn.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        double m=scn.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        double p= scn.nextDouble();

        double total=A*a+E*e+D*d+M*m+P*p;
        System.out.println("Toplam Tutar : "+total);
    }
}
