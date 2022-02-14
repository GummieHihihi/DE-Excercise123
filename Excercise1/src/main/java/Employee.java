/**
 * this class is for the employee, it return the final salary, it compute the final salary of the employee
 */
public class Employee {
    private float hourlySalary;
    private float dailySalary;
    private float hourWorkingPerDay;
    private float finalSalary;
    private float baseSalary;
    private String name;

    private final int workDayPerMonth = 20;

    public Employee(String name, float hoursInDay, int salaryPerDay){
        this.name = name;
        hourlySalary = salaryPerDay/hoursInDay;
        hourWorkingPerDay = hoursInDay;
    }

    private String getName(){
        return name;
    }

    public float getFinalSalary() {
        return finalSalary;
    }

    /**
     *this function set the information of the employee about his salary, how much money he/she earn an hour and how
     *many hour he/she works per day
     * @return the information about the employee
     */
    public String getInfo(){
        return "Employee: " + name + " works " + hourWorkingPerDay + " per day with the salary of " + hourlySalary * hourWorkingPerDay
                + " perday" + ", finalSalary= " + finalSalary;
    }

    /**
     * this function compute the daily salary of the employee
     */
    private void computeDailySalary(){
        dailySalary = hourlySalary * hourWorkingPerDay;
    }

    /**
     * this function compute base monthly salary of an employee with 20 days of work
     */
    private void computeBaseSalary(){
        baseSalary = dailySalary * workDayPerMonth;
    }

    /**
     * this function compute the final salary of the employee
     * compute the daily salary ->
     */
    public void computeFinalSalary(){
        computeDailySalary();
        addWork();
        computeBaseSalary();
        addSal();
        finalSalary = baseSalary;
    }

    /**
     * this function add 10$ to employee salary if their base salary is less than 500$ a month
     */
    private void addSal(){
        if(baseSalary < 500){
            baseSalary += 10;
        }
    }

    /**
     * this function add 5$ to employee daily if he/she works more than 6 hour per day
     */
    private void addWork(){
        if(hourWorkingPerDay>6){
            dailySalary += 5;
        }
    }
}
