import java.util.Scanner;
public class uslu2 {


    static int uslu(int taban,int us){
        if (us==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*uslu(taban, us-1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Tabanı giriniz : ");
        int taban=scn.nextInt();
        System.out.println("Üssü giriniz : ");
        int us=scn.nextInt();
        System.out.println("Sonuç : "+uslu(taban,us));


    }
}
