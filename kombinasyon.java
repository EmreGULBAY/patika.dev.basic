import java.util.Scanner;
public class kombinasyon {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("n değerini giriniz : ");
        int n=scn.nextInt();
        System.out.println("r değerini giriniz : ");
        int r=scn.nextInt();
        if(r>n){
            System.out.println("r değeri n den büyük olamaz ! ");
            System.exit(1);
        }
        int nFak=1;
        int rFak=1;
        for(int i=1;i<=n;i++){
            nFak*=i;
        }
        for(int i=1;i<=r;i++){
            rFak*=i;
        }
        int m=n-r;
        int mFak=1;
        for(int i=1;i<=m;i++){
            mFak*=i;

        }

        int c= nFak/(rFak*(mFak));
        System.out.println("Kombinasyon : "+c);




    }

}
