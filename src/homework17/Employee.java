package homework17;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            return;
        }
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else
            return;
    }

    public String info() {
        return String.format("Employee %s, age %d, salary %d", name, age, salary);
    }
}
