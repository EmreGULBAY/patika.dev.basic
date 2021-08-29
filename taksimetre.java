import java.util.Scanner;
public class taksimetre {

    public static void main(String[] args) {
	    double km;
	    int baslangıc=10;
	    double ucret=2.20;
	    Scanner scn=new Scanner(System.in);
        System.out.println("Yolu KM cinsinden giriniz:");
        km=scn.nextDouble();
        double total= 10+(km*ucret);
        total=(total<20)?20:total;

        System.out.println("Ucret: "+total);
    }
}
