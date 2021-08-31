import java.util.Scanner;
public class cin {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        int yil =scn.nextInt();
        if(yil<0) {
            System.out.println("Geçerli bir yıl giriniz !");
                System.exit(1);
        }
        if(yil%12==0)
            System.out.println("maymun");
        if(yil%12==1)
            System.out.println("horoz");
        if(yil%12==2)
            System.out.println("köpek");
        if(yil%12==3)
            System.out.println("domuz");
        if(yil%12==4)
            System.out.println("fare");
        if(yil%12==5)
            System.out.println("öküz");
        if(yil%12==6)
            System.out.println("kaplan");
        if(yil%12==7)
            System.out.println("tavşan");
        if(yil%12==8)
            System.out.println("ejderha");
        if(yil%12==9)
            System.out.println("yılan");
        if(yil%12==10)
            System.out.println("at");
        if(yil%12==11)
            System.out.println("koyun");







    }

}
