import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new Employee("John", 5, 10);
    }

    @Test
    public void getFinalSalary() {
        emp.computeFinalSalary();
        Assert.assertEquals(emp.getFinalSalary(), 210,0);
        System.out.println("test getFinalSalary success");
    }
}