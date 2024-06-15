import java.util.Scanner;

public class nestingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float height = sc.nextFloat();
        float breadth = sc.nextFloat();
        float volume  =  volume(length, height, breadth);
        System.out.println("volume of cuboid is "+ volume);
    }
    public static float volume(float length,float height,float breadth){
        float area = area(length, height, breadth);
        return area * height;
    }
    public static float area(float length,float height,float breadth){
        float perimeter = perimeter(length, height, breadth);
        return perimeter + height * breadth;
    }
    public static float perimeter(float length,float height,float breadth){
        return 2* (length * breadth);
    }
}


//    float volume = volume(length, height, breadth);
//        System.out.println("volume of cuboid "+ volume);
//}
//public static float volume(float length,float height,float breadth){
//    float area = area(length, height, breadth);
//    return area * height;
//}
//public static float area(float length,float height,float breadth){
//    float perimeter = perimeter(length, breadth);
//    return 2 * (perimeter+ height* breadth);
//}
//public static float perimeter(float length,float breadth){
//
//    return 2 * (length + breadth);
//}