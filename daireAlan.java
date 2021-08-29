import java.util.Scanner;
public class daireAlan {

    public static void main(String[] args) {
	double r,aci;
    Scanner scn=new Scanner(System.in);
        System.out.println("Yaricapi giriniz:");
        r= scn.nextDouble();
        System.out.println("Aciyi giriniz:");
        aci=scn.nextDouble();

        double alan= (Math.PI*(r*r)*aci)/360;

        System.out.println("Alan: "+alan);
    }
}
