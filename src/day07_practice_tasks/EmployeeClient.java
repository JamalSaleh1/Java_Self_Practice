package day07_practice_tasks;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Jamal";
        employee1.gender = 'M';
        employee1.age = 65;
        employee1.jobTitle = "banker";
        employee1.salary = 90_000;

        System.out.println("Name: " + employee1.name);
        System.out.println("age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("salary: " + employee1.salary);

        employee1.work();

        System.out.println(employee1);






    }
}
