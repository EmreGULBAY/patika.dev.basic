import java.util.Arrays;
public class quickSortM {

    public static void main(String[] args) {
        int []arr={2,8,9,7,5,6,3,1,5,9,4,2};
        quickSort qs=new quickSort(arr);
        System.out.println(qs);
    }


    }


class quickSort{

    private final int[] arr;
    private final int length;
        public quickSort(int [] arr){
            this.arr=arr;
            this.length=arr.length;
        }

        public int[] sort(){
            int temp;
            for(int i=0;i<length;i++){
                for(int j=0;j<length;j++){
                    if(arr[i]<arr[j]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        return arr;
        }
        public String toString(){

            return Arrays.toString(sort());
        }
}