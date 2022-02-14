public class Main {
    public static void main(String[] args) {
        Employee empA = new Employee();
        Employee empB = new Employee();
        empA.getInfo(10, 8);
        empB.getInfo(8, 8);
        empA.computeFinalSalary();
        empB.computeFinalSalary();
        System.out.println("employee A works 8 hours/day with 10$ per hour and his salary is : " + empA.getFinalSalary());
        System.out.println("employee B works 8 hours/day with 8$ per hour and his salary is : " + empB.getFinalSalary());
    }
}
