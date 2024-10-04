package homework17;

public class MainEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setAge(25);
        employee.setSalary(1500);

        System.out.println(employee.info());
    }
}
