import java.util.Scanner;
public class ortalama {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi=scn.nextInt();
        int count=0;
        int toplam =0;
        for(int i=0;i<=sayi;i++){
            if(i%3==0&&i%4==0){
                toplam +=i;
                count++;
            }
            System.out.println(count);
        }
        int average=toplam/count;
        System.out.println("Ortalama "+average);
    }

}
