package day13_practice_tasks.employee_tasks;

public class Teacher extends Employee{

    public Teacher(String name, int age, String gender, String employeeId,  double salary, String jobTitle, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
        public void work() {
            System.out.println(getName() + " is teaching.");
        }



}

