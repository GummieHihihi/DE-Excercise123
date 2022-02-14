public class Main {
    public static void main(String[] args) {

        Employee[] emps = new Employee[]{
                new Employee("john Smith", 5, 10),
                new Employee("Sandra Wang", 4, 5),
                new Employee("Gio Rossi", 7, 12)
        };
        for (Employee emp:emps) {
            emp.computeFinalSalary();
            System.out.println(emp.getInfo());
        };
    }
}
