import java.util.Random;

class Employee {
    private static boolean is_present;
    private static int total_salary = 0;
    private String company_name;
    private static int hour;
    private static int day;
    private static int salary;
    private static boolean is_part_time = false;

    public Employee(String company, int hours, int days) {
        this.company_name = company;
        this.hour = hours;
        this.day = days;
        System.out.println("Welcome to the "+company_name+" company.... ");
        calculateMonthlyWages();
    }

    public static void  calculateMonthlyWages() {
        Random rand = new Random();
        int num = rand.nextInt(10);
        if(num >= 5){
            System.out.println("Employee is present! ");
        }else{
            System.out.println("Employee is absent! ");
        }

        switch (hour) {
            case (4):
                is_part_time = true;
                System.out.println("The Employee is part time ");
            case(8):
                System.out.println("The Employee is full time ");
            default:
                System.out.println("The Employee is full time ");
        }
        total_salary += hour * 8;
        System.out.println("yours to days wages is " + total_salary);
         switch (hour) {
            case 100:
                salary += hour * day;
                System.out.println("the total days wages is " + salary);
        }
    }
}

class EmplyeeWages {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Reliance", 100, 20);
        Employee obj2 = new Employee("Tata", 80, 15);

    }
}



