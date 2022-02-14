/**
 * this class is for the employee, it return the final salary, it compute the final salary of the employee
 */
public class Employee {
    private int hourlySalary;
    private int dailySalary;
    private int hourWorkingPerDay;
    private int finalSalary;
    private int baseSalary;


    public int getFinalSalary() {
        return finalSalary;
    }

    /**
     * this function set the information of the employee about his salary, how much money he/she earn an hour and how
     * many hour he/she works per day
     * @param hourlySalarys : money employee earn each hour working
     * @param hoursInDay : the hour that employee work in a day
     */
    public void getInfo(int hourlySalarys, int hoursInDay){
        hourlySalary = hourlySalarys;
        hourWorkingPerDay = hoursInDay;
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
        baseSalary = dailySalary * 20;
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

    /**
     *
     * @return the string which show the employee final salary
     */
    @Override
    public String toString() {
        return "Employee{" +
                "finalSalary=" + finalSalary +
                '}';
    }
}
