package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result = 0;
                if (salary < 0){
                    System.out.println("wrong input!");
                    return;
                }
                else if (salary > 20000){
                    result = salary * 0.8;}
                else if (salary <= 10000){
                    result = salary * 0.85;
                    }
                else if(salary <= 20000){
                    result = salary * 0.82;
                }


        System.out.println(result);
    }
}
