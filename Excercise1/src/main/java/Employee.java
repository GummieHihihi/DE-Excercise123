public class Employee {
    private int hourlySalary;
    private int dailySalary;
    private int hourWorkingPerDay;
    private int finalSalary;
    private int baseSalary;

    public int getFinalSalary() {
        return finalSalary;
    }

    public void getInfo(int hourlySalarys, int hoursInDay){
        hourlySalary = hourlySalarys;
        hourWorkingPerDay = hoursInDay;
    }

    private void computeDailySalary(){
        dailySalary = hourlySalary * hourWorkingPerDay;
    }

    private void computeBaseSalary(){
        baseSalary = dailySalary * 20;
    }

    public void computeFinalSalary(){
        computeDailySalary();
        addWork();
        computeBaseSalary();
        addSal();
        finalSalary = baseSalary;
    }

    private void addSal(){
        if(baseSalary < 500){
            baseSalary += 10;
        }
    }

    private void addWork(){
        if(hourWorkingPerDay>6){
            dailySalary += 5;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "finalSalary=" + finalSalary +
                '}';
    }
}
