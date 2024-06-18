import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4 ,56, 7, 7};
        int len = array.length;
        for (int i=0; i<len; i++){
            for (int j =i; j< len; j++){
                if(array[i] < array[j]){
                    int y = array[i];
                    array[i] = array[j];
                    array[j] = y;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}





// ArmStrong number
//Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//int du = num;
//int numdigit = Integer.toString(num).length();
//int multi = 0;
//        while(du>0){
//int digit =  du % 10;
////System.out.println(digit);
//multi += Math.pow(digit, numdigit);
//du/=10;
//        }
//        if(multi == num){
//        System.out.println("number is armstrong num");
//        }
//                else{
//                System.out.println("number is not a armstrong num");
//        }



//String len = String.valueOf(num);
//char[] charArray =  len.toCharArray() ;
//int a = charArray.length-1;
//String Array = "";
//String du ;
//        for(int i=a; i>=0; i--){
//        System.out.println(charArray[i]);
//Array = Array + charArray[i];
//        }
//        if (Integer.parseInt(Array) == num){
//        System.out.println("this num is palindrome ");
//        }
//                else{
//                System.out.println("this num is not palindrome ");
//        }















//
///boolean mybool = false;
//byte mybyte = 10;
//short myShort = 10;
//long myLong = 12334345L;
//float myFloat = 12.4F;
//double mydouble = 12.33;
//char myChar = 'A';
//int a = 5; // binary: 101
//int b = 3; // binary: 011
//int bitwiseAnd = a & b; // 1 (binary: 001)
//int bitwiseOr = a | b; // 7 (binary: 111)
//int bitwiseXor = a ^ b; // 6 (binary: 110)
//        System.out.println(bitwiseAnd+" "+ bitwiseOr+" "+ bitwiseXor);
//String my = "Hitendra";
//        System.out.println(mybool);
//        System.out.println(mybyte);
//        System.out.println(myShort);
//        System.out.println(myLong);
//        System.out.println(myFloat);
//        System.out.println(mydouble);
//        System.out.println(myChar);
//        System.out.println(my);