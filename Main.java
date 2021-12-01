import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        BitWise bit = new BitWise();
        bit.start();
    }
}

/**
 * This class is for manipulating inputs and do bitwise operations on them.
 * @Author Emre GULBAY
 */
class BitWise{
    private Scanner scn=new Scanner(System.in);
    public BitWise(){
    }

    /**
     * This is a method to run the interface.
     *      * Takes an input from the user to decide which primitive
     *      * type the does the user want to use.
     *      * According to the first choice takes another input to
     *      * decide which operator does the user want to use.
     *      * Takes input(s) according to second choice and does the operation.
     *
     * @throws IllegalArgumentException if an invalid input's entered.
     *
     */
    public void start()throws IllegalArgumentException{
        System.out.println("Give the type of input? int=0, string=1," +
                " double=2");
        int choice=scn.nextInt();
        switch (choice){
            case 0:
                System.out.println("Give the type of input? or=0, and=1," +
                        " xor=2, complement=3, right shift=4," +
                        " left shift=5");
                int choice2=scn.nextInt();
                switch (choice2){
                    case 0:
                        System.out.println("First Integer Number :");
                        int number1=scn.nextInt();
                        System.out.println("Second Integer Number :");
                        int number2=scn.nextInt();
                        System.out.println(or(number1,number2));
                        break;
                    case 1:
                        System.out.println("First Integer Number :");
                        int number3=scn.nextInt();
                        System.out.println("Second Integer Number :");
                        int number4=scn.nextInt();
                        System.out.println(and(number3,number4));
                        break;
                    case 2:
                        System.out.println("First Integer Number :");
                        int number5=scn.nextInt();
                        System.out.println("Second Integer Number :");
                        int number6=scn.nextInt();
                        System.out.println(xor(number5,number6));
                        break;
                    case 3:
                        System.out.println("Integer Number :");
                        int number7=scn.nextInt();
                        System.out.println(complement(number7));
                        break;
                    case 4:/** takes 2 integer numbers as parameters and calls rs method*/
                        System.out.println("Integer Number :");
                        int number8=scn.nextInt();
                        System.out.println("Shift Number :");
                        int number9=scn.nextInt();
                        System.out.println(rs(number8,number9));
                        break;
                    case 5:
                        System.out.println("Integer Number :");
                        int number10=scn.nextInt();
                        System.out.println("Shift Number :");
                        int number11=scn.nextInt();
                        System.out.println(ls(number10,number11));
                        break;
                    default:
                        throw new IllegalArgumentException("Wrong input detecte" +
                                "d! Exiting System!");
                }
                break;
            case 1:
                System.out.println("Give the type of input? or=0, and=1," +
                        " xor=2, complement=3, right shift=4," +
                        " left shift=5");
                int choice3=scn.nextInt();
                switch (choice3){
                    case 0:
                        System.out.println("First String :");
                        String number1=scn.next();
                        System.out.println("Second String :");
                        String number2=scn.next();
                        System.out.println(or(number1,number2));
                        break;
                    case 1:
                        System.out.println("First String :");
                        String number3=scn.next();
                        System.out.println("Second String :");
                        String number4=scn.next();
                        System.out.println(and(number3,number4));
                        break;
                    case 2:
                        System.out.println("First String :");
                        String number5=scn.next();
                        System.out.println("Second String :");
                        String number6=scn.next();
                        System.out.println(xor(number5,number6));
                        break;
                    default:{
                        throw new IllegalArgumentException("Wrong input detecte" +
                                "d! Exiting System!");}

                }
                break;
            case 2:
                System.out.println("Give the type of input? or=0, and=1," +
                        " xor=2, complement=3, right shift=4," +
                        " left shift=5");
                int choice4=scn.nextInt();
                switch (choice4){
                    case 0:
                        System.out.println("First Double Number :");
                        double number1=scn.nextDouble();
                        System.out.println("Second Double Number :");
                        double number2=scn.nextDouble();
                        System.out.println(or(number1,number2));
                        break;
                    case 1:
                        System.out.println("First Double Number :");
                        double number3=scn.nextDouble();
                        System.out.println("Second Double Number :");
                        double number4=scn.nextDouble();
                        System.out.println(and(number3,number4));
                        break;
                    case 2:
                        System.out.println("First Double Number :");
                        double number5=scn.nextDouble();
                        System.out.println("Second Double Number :");
                        double number6=scn.nextDouble();
                        System.out.println(xor(number5,number6));
                        break;
                    default:
                        throw new IllegalArgumentException("Wrong input detecte" +
                                "d! Exiting System!");
                }
                break;
        }
    }

    /**
     * This method is for turning an input into bitwise presentation.
     * @param arr your array which you want to fill.
     */
    public  void turnBinary(int[] arr){
        int k = 1;
        for (int i=arr.length-1;i>=0;i--){
            arr[i]+=k;
            if (arr[i]>1){
                arr[i]=0;
                k=1;
            }
            else{
                k=0;
            }
        }
    }

    /**
     * This method takes 2 input from the user and calls turnBinary() method
     * and adds 2 arrays that we filled into the String and then
     * does the or operation
     * between 2 inputs and also put it in an array and then put in the String.
     *
     * @param a your first input that you want to make operations.
     * @param b your second input.
     * @return result which contains or operations between 2 inputs
     * as a String.
     */
    public String or(int a,int b){
        int count=0;
        int [] arr=new int[32];
        int [] arr2=new int[32];
        String word=" ";
            for(int i=0;i<a;i++){
                turnBinary(arr);
            }
            for(int i=0;i<arr.length;i++){
                if(count!=0&&count%8==0)
                    word+=" ";
                word+=arr[i];
                count++;
            }
        word+=" |\n";
            for(int i=0;i<b;i++){
                turnBinary(arr2);
            }
            for(int i=0;i<arr2.length;i++){
                if(count%8==0)
                    word+=" ";
                word+=arr2[i];
                count++;
            }
            word+="\n";
            int k=0;
            while(k<36){
                word+="-";
                k++;
            }
            word+="\n";
            int c=a|b;
            int [] arr3=new int[32];
            for(int i=0;i<c;i++){
                turnBinary(arr3);
            }
            count=0;
            for(int i=0;i<arr3.length;i++){
                if(count%8==0)
                    word+=" ";
                word+=arr3[i];
                count++;
            }
            word+=" = "+c;
        return word;
    }

    /**
     * This method takes 2 input from the user and calls turnBinary() method
     * and adds 2 arrays that we filled into the String and then
     * does the and operation
     * between 2 inputs and also put it in an array and then put in the String.
     *
     * @param a your first input that you want to make operations.
     * @param b your second input.
     * @return result which contains and operations between 2 inputs
     * as a String.
     */
    public String and(int a,int b){
        int count=0;
        int [] arr=new int[32];
        int [] arr2=new int[32];
        String word=" ";
        for(int i=0;i<a;i++){
            turnBinary(arr);
        }
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr[i];
            count++;
        }
        word+=" &\n";
        for(int i=0;i<b;i++){
            turnBinary(arr2);
        }
        for(int i=0;i<arr2.length;i++){
            if(count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+="\n";
        int k=0;
        while(k<36){
            word+="-";
            count++;
            k++;
        }
        word+="\n";
        int c=a&b;
        int [] arr3=new int[32];
        for(int i=0;i<c;i++){
            turnBinary(arr3);
        }
        count=0;
        for(int i=0;i<arr3.length;i++){
            if(count%8==0)
                word+=" ";
            word+=arr3[i];
            count++;
        }
        word+=" = "+c;
        return word;
    }

    /**
     * This method takes 2 input from the user and calls turnBinary() method
     * and adds 2 arrays that we filled into the String and then
     * does the xor operation
     * between 2 inputs and also put it in an array and then put in the String.
     *
     * @param a your first input that you want to make operations.
     * @param b your second input.
     * @return result which contains and operations between 2 inputs
     * as a String.
     */
    public String xor(int a,int b){
        int count=0;
        int [] arr=new int[32];
        int [] arr2=new int[32];
        String word=" ";
        for(int i=0;i<a;i++){
            turnBinary(arr);
        }
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr[i];
            count++;
        }
        word+=" ^\n";
        for(int i=0;i<b;i++){
            turnBinary(arr2);
        }
        for(int i=0;i<arr2.length;i++){
            if(count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+="\n";
        int k=0;
        while(k<36){
            word+="-";
            k++;
        }
        word+="\n";
        int c=a|b;
        int [] arr3=new int[32];
        for(int i=0;i<c;i++){
            turnBinary(arr3);
        }
        count=0;
        for(int i=0;i<arr3.length;i++){
            if(count%8==0)
                word+=" ";
            word+=arr3[i];
            count++;
        }
        word+=" = "+c;
        return word;
    }

    /**
     * This method takes an input and does the turnBinary() operation
     * and then add the formed array into a String and then takes the first
     * input's complement and adds it into the String and then returns
     * the String.
     *
     * @param a your input that you want to take complement of.
     * @return result which contains the input and the complement.
     */
    public String complement(int a){
        int [] arr=new int[32];
        int [] arr2=new int[32];
        int count=0;
        String word="";
        word+="~";
        for(int i=0;i<a;i++){
            turnBinary(arr);
        }
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr[i];
            count++;
        }
        count=0;
        int b=~a;
        word+=" = ";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                arr2[i]=1;
            else if(arr[i]==1)
                arr2[i]=0;
        }
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+= " = "+~a;
        return word;
    }

    /**This method takes an input from the user and an amount which the user wants
     * to do right shift operation.
     *
     * @param a your input that you want to make shifting operation on.
     * @param number your input that presents the amount of right shift operations.
     * @return result which contains the answer.
     */
    public String rs(int a,int number){
        String word=" ";
        int count=0;
        int c=a>>number;
        int [] arr2=new int[32];
        for(int i=0;i<c;i++){
            turnBinary(arr2);
        }
        word+=a+" >> "+number;
        word+=" = ";
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+=" = "+c;
        return word;
    }

    /**
     * This method takes an input from the user and an amount which the user wants
     * to do left shift operation.
     *
     * @param a your input that you want to make shifting operation on.
     * @param number your input that presents the amount of left shift operations.
     * @return result which contains the answer.
     */
    public String ls(int a,int number){
        String word=" ";
        int count=0;
        int c=a<<number;
        int [] arr2=new int[32];
        for(int i=0;i<c;i++){
            turnBinary(arr2);
        }
        word+=a+" << "+number+" = ";
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+=" = "+c;
        return word;
    }

    /**
     * This method takes 2 input's from the user and put them in char arrays.
     * Then creates a temporary int array with a capacity of 8 and takes char's
     * and calls turnBinary method and turns them into bitWise representation.
     * Then assign results into int arrays and put them into the String
     * Then do the or operation on the arrays and assign the result into
     * the new array.
     * Then assign the answer into the String and returns it.
     *
     *
     * @param a your first String input
     * @param b your second String input
     * @return result that contains input's bitwise representation
     * and answer's.
     */
    public String or(String a,String b){
        String word="";
        int[] tempArr;
        int max=Math.max(a.length(),b.length());
        int[] arr=new int[max*8];
        int[] arr2=new int[max*8];
        int[] arr3=new int[max*8];
        int k=arr.length-1;
        int t=arr2.length-1;
        char[] aChar=a.toCharArray();
        char[] bChar=b.toCharArray();
        for(int i=aChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<aChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr[k]=tempArr[l];
                k--;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+= arr[i];
            count++;
        }
        count=0;
        word+=" |\n";
        for(int i=bChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<bChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr2[t]=tempArr[l];
                t--;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+="\n";
        for(int i=0;i<(max*8)+6;i++){
            word+="-";
        }
        word+="\n";
        k=arr.length-1;
        t=arr2.length-1;
        int p=arr3.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[k]==1&&arr2[t]==1)
                arr3[p]=1;
            else if(arr[k]==0&&arr2[t]==1)
                arr3[p]=1;
            else if(arr[k]==1&&arr2[t]==0)
                arr3[p]=1;
            else
                arr3[p]=0;
            t--;
            k--;
            p--;
        }
        count=0;
        for(int i=0;i<arr3.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr3[i];
            count++;
        }
        String tempStr="";
        for(int i=0;i<arr3.length;i++){
            tempStr+=arr3[i];
        }
        String str = "";

        for (int i = 0; i < tempStr.length()/8; i++) {
            int temp = Integer.parseInt(tempStr.substring(8*i,(i+1)*8),2);
            str += (char)(temp);
        }
        word+=" = "+str;

        return word;
    }

    /**
     * This method takes 2 input's from the user and put them in char arrays.
     * Then creates a temporary int array with a capacity of 8 and takes char's
     * and calls turnBinary method and turns them into bitWise representation.
     * Then assign results into int arrays and put them into the String
     * Then do the and operation on the arrays and assign the result into
     * the new array.
     * Then assign the answer into the String and returns it.
     *
     *
     * @param a your first String input
     * @param b your second String input
     * @return result that contains input's bitwise representation
     * and answer's.
     */
    public String and(String a,String b){
        String word="";
        int[] tempArr;
        int max=Math.max(a.length(),b.length());
        int[] arr=new int[max*8];
        int[] arr2=new int[max*8];
        int[] arr3=new int[max*8];
        int k=arr.length-1;
        int t=arr2.length-1;
        char[] aChar=a.toCharArray();
        char[] bChar=b.toCharArray();
        for(int i=aChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<aChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr[k]=tempArr[l];
                k--;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+= arr[i];
            count++;
        }
        count=0;
        word+=" &\n";
        for(int i=bChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<bChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr2[t]=tempArr[l];
                t--;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+="\n";
        for(int i=0;i<(max*8)+6;i++){
            word+="-";
        }
        word+="\n";
        k=arr.length-1;
        t=arr2.length-1;
        int p=arr3.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[k]==1&&arr2[t]==1)
                arr3[p]=1;
            else
                arr3[p]=0;
            t--;
            k--;
            p--;
        }
        count=0;
        for(int i=0;i<arr3.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr3[i];
            count++;
        }
        String tempStr="";
        for(int i=0;i<arr3.length;i++){
            tempStr+=arr3[i];
        }
        String str = "";

        for (int i = 0; i < tempStr.length()/8; i++) {

            int temp = Integer.parseInt(tempStr.substring(8*i,(i+1)*8),2);
            str += (char)(temp);
        }

        word+=" = "+str;

        return word;
    }

    /**
     * This method takes 2 input's from the user and put the in char arrays.
     * Then creates a temporary int array with a capacity of 8 and takes char's
     * and calls turnBinary method and turns them into bitWise representation.
     * Then assign results into int arrays and put them into the String
     * Then do the xor operation on the arrays and assign the result into
     * the new array.
     * Then assign the answer into the String and returns it.
     *
     *
     * @param a your first String input
     * @param b your second String input
     * @return result that contains input's bitwise representation
     * and answer's.
     */
    public String xor(String a,String b){
        String word="";
        int[] tempArr;
        int max=Math.max(a.length(),b.length());
        int[] arr=new int[max*8];
        int[] arr2=new int[max*8];
        int[] arr3=new int[max*8];
        int k=arr.length-1;
        int t=arr2.length-1;
        char[] aChar=a.toCharArray();
        char[] bChar=b.toCharArray();
        for(int i=aChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<aChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr[k]=tempArr[l];
                k--;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+= arr[i];
            count++;
        }
        count=0;
        word+=" ^\n";
        for(int i=bChar.length-1;i>=0;i--){
            tempArr=new int[8];
            for(int j=0;j<bChar[i];j++){
                turnBinary(tempArr);
            }
            for(int l=tempArr.length-1;l>=0;l--){
                arr2[t]=tempArr[l];
                t--;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr2[i];
            count++;
        }
        word+="\n";
        for(int i=0;i<(max*8)+6;i++){
            word+="-";
        }
        word+="\n";
        k=arr.length-1;
        t=arr2.length-1;
        int p=arr3.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[k]==0&&arr2[t]==1)
                arr3[p]=1;
            else if(arr[k]==1&&arr2[t]==0)
                arr3[p]=1;
            else
                arr3[p]=0;
            t--;
            k--;
            p--;
        }
        count=0;
        for(int i=0;i<arr3.length;i++){
            if(count!=0&&count%8==0)
                word+=" ";
            word+=arr3[i];
            count++;
        }
        String tempStr="";
        for(int i=0;i<arr3.length;i++){
            tempStr+=arr3[i];
        }
        String str = "";

        for (int i = 0; i < tempStr.length()/8; i++) {

            int temp = Integer.parseInt(tempStr.substring(8*i,(i+1)*8),2);
            str += (char)(temp);
        }

        word+=" = "+str;

        return word;
    }

    /**
     * This method takes 2 inputs and use
     * Long.toBinaryString(Double.doubleToRawLongBits()) method chain to make them
     * them into bitWise representation.Then put them in char arrays.
     * After that, put them in a new String in a splitted shape.
     * Then put the Strings is a final string that will returned.
     * Also put these Strings into int arrays by using(Integer.parseInt())
     * to do or operations.Then puts the answer into the final String
     * as well and returns it.
     *
     * @param a your first double input
     * @param b your second double input
     * @return result that contains the inputs' bitWise representation and
     * answer's.
     */
    public String or(double a,double b){
        String word="";
        String x="";
        String k="";
        x+="0";
        x+=Long.toBinaryString(Double.doubleToRawLongBits(a));
        if(x.length()<64) {
            k += "0"+x;
            x=k;
        }
        char[] c=x.toCharArray();
        String str="";
        for(int i=0;i<c.length;i++){
            if(i!=0&&i%8==0)
                str+=" ";
            str+=c[i];
        }
        word+=str+" |\n";
        String y="";
        String t="";
        y+="0";
        y+=Long.toBinaryString(Double.doubleToRawLongBits(b));
        while(y.length()<64){
            t+="0";
        }
        t+=y;
        y=t;
        char[] d=y.toCharArray();
        String str2="";
        for(int i=0;i<d.length;i++){
            if(i!=0&&i%8==0)
                str2+=" ";
            str2+=d[i];
        }
        word+=str2+"\n";
        for(int i=0;i<71;i++){
            word+="-";
        }
        word+="\n";
        int [] arr=new int[x.length()];
        int [] arr2=new int[y.length()];
        int [] arr3=new int[x.length()];
        for(int i=0;i<x.length();i++){
            arr[i]=Integer.parseInt(x.substring(i,i+1),2);
            arr2[i]=Integer.parseInt(y.substring(i,i+1),2);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1&&arr2[i]==1)
                arr3[i]=1;
            else if(arr[i]==0&&arr2[i]==1)
                arr3[i]=1;
            else if(arr[i]==1&&arr2[i]==0)
                arr3[i]=1;
            else
                arr3[i]=0;
        }
        String temp="";
        for(int i=0;i<arr3.length;i++){
            if(i!=0&&i%8==0)
                temp+=" ";
            temp+=arr3[i];
        }
        word+=temp;
        return word;
    }

    /**
     * This method takes 2 inputs and use
     * Long.toBinaryString(Double.doubleToRawLongBits()) method chain to make them
     * them into bitWise representation.Then put them in char arrays.
     * After that, put them in a new String in a splitted shape.
     * Then put the Strings is a final string that will returned.
     * Also put these Strings into int arrays by using(Integer.parseInt())
     * to do and operations.Then puts the answer into the final String
     * as well and returns it.
     *
     * @param a your first double input
     * @param b your second double input
     * @return result that contains the inputs' bitWise representation and
     * answer's.
     */
    public String and(double a,double b){
        String word="";
        String x="";
        String k="";
        x+="0";
        x+=Long.toBinaryString(Double.doubleToRawLongBits(a));
        while(x.length()<64){
            k+="0";
        }
        k+=x;
        x=k;
        char[] c=x.toCharArray();
        String str="";
        for(int i=0;i<c.length;i++){
            if(i!=0&&i%8==0)
                str+=" ";
            str+=c[i];
        }
        word+=str+" &\n";
        String y="";
        String t="";
        y+="0";
        y+=Long.toBinaryString(Double.doubleToRawLongBits(b));
        if(y.length()<64) {
            t += "0"+y;
            y=t;
        }
        char[] d=y.toCharArray();
        String str2="";
        for(int i=0;i<d.length;i++){
            if(i!=0&&i%8==0)
                str2+=" ";
            str2+=d[i];
        }
        word+=str2+"\n";
        for(int i=0;i<71;i++){
            word+="-";
        }
        word+="\n";
        int [] arr=new int[x.length()];
        int [] arr2=new int[y.length()];
        int [] arr3=new int[x.length()];
        for(int i=0;i<x.length();i++){
            arr[i]=Integer.parseInt(x.substring(i,i+1),2);
            arr2[i]=Integer.parseInt(y.substring(i,i+1),2);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1&&arr2[i]==1)
                arr3[i]=1;
            else
                arr3[i]=0;
        }
        String temp="";
        for(int i=0;i<arr3.length;i++){
            if(i!=0&&i%8==0)
                temp+=" ";
            temp+=arr3[i];
        }
        word+=temp;
        return word;
    }

    /**
     * This method takes 2 inputs and use
     * Long.toBinaryString(Double.doubleToRawLongBits()) method chain to make them
     * them into bitWise representation.Then put them in char arrays.
     * After that, put them in a new String in a splitted shape.
     * Then put the Strings is a final string that will returned.
     * Also put these Strings into int arrays by using(Integer.parseInt())
     * to do xor operations.Then puts the answer into the final String
     * as well and returns it.
     *
     * @param a your first double input
     * @param b your second double input
     * @return result that contains the inputs' bitWise representation and
     * answer's.
     */
    public String xor(double a,double b){
        String word="";
        String x="";
        String k="";
        x+="0";
        x+=Long.toBinaryString(Double.doubleToRawLongBits(a));
        while(x.length()<64){
            k+="0";
        }
        k+=x;
        x=k;
        char[] c=x.toCharArray();
        String str="";
        for(int i=0;i<c.length;i++){
            if(i!=0&&i%8==0)
                str+=" ";
            str+=c[i];
        }
        word+=str+" ^\n";
        String y="";
        String t="";
        y+="0";
        y+=Long.toBinaryString(Double.doubleToRawLongBits(b));
        if(y.length()<64) {
            t += "0"+y;
            y=t;
        }
        char[] d=y.toCharArray();
        String str2="";
        for(int i=0;i<d.length;i++){
            if(i!=0&&i%8==0)
                str2+=" ";
            str2+=d[i];
        }
        word+=str2+"\n";
        for(int i=0;i<71;i++){
            word+="-";
        }
        word+="\n";
        int [] arr=new int[x.length()];
        int [] arr2=new int[y.length()];
        int [] arr3=new int[x.length()];
        for(int i=0;i<x.length();i++){
            arr[i]=Integer.parseInt(x.substring(i,i+1),2);
            arr2[i]=Integer.parseInt(y.substring(i,i+1),2);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0&&arr2[i]==1)
                arr3[i]=1;
            else if(arr[i]==1&&arr2[i]==0)
                arr3[i]=1;
            else
                arr3[i]=0;
        }
        String temp="";
        for(int i=0;i<arr3.length;i++){
            if(i!=0&&i%8==0)
                temp+=" ";
            temp+=arr3[i];
        }
        word+=temp;
        return word;
    }
}