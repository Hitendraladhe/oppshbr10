import java.util.Random;
class Company{

}
class Employee extends Company{
    boolean isPresent;
    int wages = 0;
    int salary;
    void employeePresentOrNot(int isPresent){
       if (isPresent >=5){
           System.out.println("Employee is present!");
       }
       else{
           System.out.println("Employee is absent!");
       }
    }
    void dailyWages(int hour ){
        wages += hour * 8;
        System.out.println("yours to days wages is " + wages);
    }
    void monthlyWages(int hour, int days ){
        salary += hour * days;
        System.out.println("yours to days wages is " + salary);
    }
    void monthlyCondWages(int hour, int days ){
        if(hour >= 1000 && days>=20){
            salary += hour * days;
            System.out.println("yours to days wages is " + salary);
        }
    }
}

public class EmplyeeWages {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("Welcome to the office....");
        Employee obj = new Employee();
        obj.employeePresentOrNot(num);

    }
}
