
public class dizideTekrarEdenler {

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,9,7,8,2,4,5,8,7,4,5,9,2,5,6,3,6};
        int[] dupArr = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])&& arr[i]%2<1 ) {
                    if (!isFind(dupArr, arr[i])) {
                        dupArr[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int value : dupArr){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}

