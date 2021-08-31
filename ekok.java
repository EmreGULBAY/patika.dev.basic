import java.util.Scanner;

public class ekok {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
        System.out.println("1. sayiyi giriniz : ");
        int n=scn.nextInt();
        System.out.println("2. sayiyi giriniz : ");
        int k =scn.nextInt();
        int ebob =0;
        int i=1;
        while(i<=n){
            if(n%i==0&&k%i==0)
                ebob=i;
            i++;
        }
        System.out.println("Ebob : "+ebob);
        int ekok=(n*k)/ebob;
        System.out.println("Ekok : "+ekok);
    }
}
