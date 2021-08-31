import java.util.Scanner;
public class ucakBileti {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    double indirim=0;
        System.out.println("Gideceğiniz mesafeyi km cinsinden giriniz : ");
        double mesafe =scn.nextDouble();
        if(mesafe<0){
            System.out.println("Hatalı veri Girdiniz !");
            System.exit(1);
        }
        System.out.println("Yaşınızı giriniz : ");
        int yas=scn.nextInt();
        if(yas<0){
            System.out.println("Hatalı Veri Girdiniz !");
        System.exit(1);
        }
        System.out.println("Yolculuk tipini giriniz (1:tek - 2:çift)");
        int tip=scn.nextInt();
        if(tip>2||tip<1){
            System.out.println("Hatalı Veri Girdiniz !");
        System.exit(1);}
            double ücret = mesafe*0.10;
            if(yas<12&&tip==1)
                ücret-=ücret*0.5;
            if((yas>=12&&yas<24)&&tip==1)
                ücret-=mesafe*0.10;
            if(yas>65&&tip==1)
                ücret-=ücret*0.30;

            if(yas<12&&tip==2){
                ücret-=ücret*0.5;
                ücret-=ücret*0.2;
                ücret=2*ücret;
            }
        if((yas>=12&&yas<24)&&tip==2){
            ücret-=ücret*0.1;
            ücret-=ücret*0.2;
            ücret=2*ücret;
        }if(yas>65&&tip==2){
            ücret-=ücret*0.3;
            ücret-=ücret*0.2;
            ücret=2*ücret;
        }

        System.out.println("Borcunuz : "+ücret);

    }
}
