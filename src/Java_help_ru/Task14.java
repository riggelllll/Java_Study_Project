package Java_help_ru;

public class Task14 {
    private double weekSalary;
    private static int MIN_SALARY = 8;
    private static int MAX_WORK_HOURS = 60;
    private static int LIMIT_WORK_HOURS = 40;

    private void calculate(int hourSalary, int workHours){
        if (hourSalary < MIN_SALARY) return;
        if (workHours > MAX_WORK_HOURS)return;
        if (workHours > LIMIT_WORK_HOURS){
            int part1 = LIMIT_WORK_HOURS * hourSalary;
            int diff = workHours - LIMIT_WORK_HOURS;
            double part2 = (hourSalary * 1.5) * diff;
            weekSalary = part1 + part2;
        }else {
            weekSalary = hourSalary * workHours;
        }


    }

    private void showSalary(){
        System.out.println("Your salary is " + weekSalary);
    }

    void run(){
        calculate(10, 50);
        showSalary();
    }
}
