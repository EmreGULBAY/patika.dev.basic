import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int sayi,min=0,max=0,adet;
        System.out.print("Kaç adet sayı girilicek : ");
        adet=scn.nextInt();
        for (int i=1; i<=adet;i++){
            System.out.print(i+". Sayıyı giriniz: ");
            sayi=scn.nextInt();
            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max){
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);

    }
}
