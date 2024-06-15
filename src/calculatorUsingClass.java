import java.util.Scanner;
import java.util.Random;
class Calculator{
    int a;
    int b;
    void Calculator(){
        System.out.println("Welcome to the calculator!");
    }
    void add(int a, int b){
        System.out.println("The answer of adding two number is "+ a+b);
    }
    void sub(int a, int b){
        int sub = a-b;
        System.out.println("The answer of adding two number is "+ sub);
    }
    void multiply(int a, int b){
        System.out.println("The answer of adding two number is "+ a*b);
    }
    void devide(int a, int b){
        System.out.println("The answer of adding two number is "+ a/b);
    }
    void reminder(int a, int b){
        System.out.println("The answer of adding two number is "+ a%b);
    }
}
public class calculatorUsingClass {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(2,3);
        obj.sub(2,3);
        obj.multiply(2,3);
        obj.devide(2,3);
        obj.reminder(2,3);
    }
}
