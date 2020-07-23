package test.sda3;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1994, 1000.25);
        System.out.println(employee.seetingYear());
        System.out.println(employee.whoAmI());
        Manager manager = new Manager(1982,2000.52);
        System.out.println(manager.getSalary());
        System.out.println(manager.whoAmI());

    }
}
