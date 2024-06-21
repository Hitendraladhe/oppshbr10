import java.util.Random;

class Employee {
    private static boolean is_present;
    private static int total_salary = 0;
    private String company_name;
    private static int hour;
    private static int day;
    private static int salary;
    private static boolean is_part_time = false;
    private static int wages;

    public Employee(String company, int hours, int days) {
        this.company_name = company;
        this.hour = hours;
        this.day = days;
        switch(company_name){
            case ("Reliance"):
                wages = 20;
                break;
            case("Tata"):
                wages = 32;
                break;
            default:
                wages = 23;
        }
        System.out.println("Welcome to the "+company_name+" company.... ");
    }

    public void employeeIsPresentOrNot(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        if(num >= 5){
            System.out.println("Employee is present! ");
        }else{
            System.out.println("Employee is absent! ");
        }
    }
    public void calculateWages(int hours,int days){
        total_salary += hour * days * wages;
        System.out.println("yours to days wages is " + total_salary);
        switch (hour) {
            case (4):
                is_part_time = true;
                System.out.println("The Employee is part time ");
            case(8):
                System.out.println("The Employee is full time ");
            default:
                System.out.println("The Employee is full time ");
        }
    }
    public void  calculateMonthlyWages() {
        switch (hour) {
            case 100:
                salary += wages*hour * day;
                System.out.println("the total days wages is " + salary);
        }
    }
}

public class EmplyeeWages {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Reliance", 100, 20);
        Employee emp2 = new Employee("Tata", 80, 15);
        Employee emp3 = new Employee("Honda", 45, 22);
        emp1.employeeIsPresentOrNot();
        emp1.calculateMonthlyWages();
        emp1.calculateWages(8, 1);
        emp2.employeeIsPresentOrNot();
        emp2.calculateMonthlyWages();
        emp2.calculateWages(34, 2);
        emp3.employeeIsPresentOrNot();
        emp3.calculateMonthlyWages();
        emp3.calculateWages(34, 2);
    }
}



