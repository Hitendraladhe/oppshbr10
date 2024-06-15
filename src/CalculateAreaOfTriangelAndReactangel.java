import java.util.Scanner;
//class Shape{
//
//}
class Triangle{
    void areaOfTriangle(int length, int breadth){
        System.out.println("Area of triangle is "+ length*breadth/2);
    }
}

class Rectangle{
    void areaOfRectangle(int length, int breadth){
        System.out.println("Area of Reactangle is "+ length*breadth);
    }
}
public class CalculateAreaOfTriangelAndReactangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Triangle objTr = new Triangle();
        objTr.areaOfTriangle(length, breadth);
        Rectangle objRect = new Rectangle();
        objRect.areaOfRectangle(length, breadth);
    }
}
