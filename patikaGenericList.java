import java.util.Arrays;

public class patikaGenericList {

    public static void main(String[] args) {
        List<Integer> liste = new List<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        List<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());

    }
}
class List<E>{
    private int size=0;
    private int capacity;
    private Object [] arr;
        public List(){
            capacity=10;
            this.arr=(E[]) new Object[capacity];
        }
        public List(int capacity){
            this.capacity=capacity;
            this.arr=(E[]) new Object[capacity];
        }
        public int size(){
            return size;
        }
        public int getCapacity(){
            return this.capacity;
        }
        public <E> void add(E data){
            if(size==this.capacity)
                capacity*=2;
            arr[size]=data;
            size++;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void set (int index,E data){
            if(index<0||index>capacity){
                System.out.println("null");
            }
            else {
                System.out.println("We changed "+arr[index]+" by "+data);
                arr[index] = data;
            }
        }
        public Object get(int index)throws RuntimeException{
            if(isEmpty()){
                throw new RuntimeException("Array is Empty!");
            }
            else if(index<0||index>=capacity){
                return null;
            }
            else{
                return arr[index];
            }
        }
        public void remove(int index)throws RuntimeException{
            if(isEmpty()){
                throw new RuntimeException("Array is Empty!");
            }
            else if(index<0||index>=capacity){
                System.out.println("null");
            }
            else{
                arr[index]=null;
                for (int i = index; i < this.size - 1; i++) {
                    this.arr[i] = this.arr[i + 1];
                }
            }
        size--;
        }
        public int indexOf(E data){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==data){
                    return i;
                }
            }
            return -1;
        }
        public int lastIndexOf(E data){
            for(int i=size-1;i>=0;i--){
                if(arr[i].equals(data)) {
                    return i;
                }
            }
            return -1;
        }
        public void clear(){
            Arrays.fill(arr, null);
        }
        public List<E> subList(int start,int finish){
            int temp =0;
            List list=new List(arr.length);
            if(finish<start){
                temp=finish;
                finish=start;
                start=temp;
            }
            for(int i=start;i<=finish;i++){
                    list.add(arr[i]);
            }
            return list ;
        }
        public boolean contains(E data){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==data)
                    return true;
            }
            return false;
        }
    public Object[] toArray() {
        Object [] array = (E[]) new Object[this.size];
        for(int i = 0; i < this.size; i++) {

            array[i] = this.arr[i];
        }
        return array;
    }
    public String toString() {
        String str = "[";
        for (int i = 0 ; i < this.size; i++) {
            if(arr[i]!=null) {
                str += this.arr[i];
                if (i != this.size - 1) {
                    str += ", ";
                }
            }
        }
        str += "]";

        return str;
    }

}