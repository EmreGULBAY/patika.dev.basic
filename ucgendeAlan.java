import java.util.Scanner;
public class ucgendeAlan {

    public static void main(String[] args) {
	   double a,b,c;
        Scanner scn=new Scanner(System.in);
        System.out.println("Ilk kenari giriniz:");
        a=scn.nextDouble();
        System.out.println("Ikinci kenari giriniz:");
        b=scn.nextDouble();
        System.out.println("Ucuncu kenari giriniz:");
        c=scn.nextDouble();

        double u =(a+b+c)/2;

        double alan= Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Alan: "+alan);
    }
}
