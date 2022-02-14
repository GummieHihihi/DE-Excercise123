import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new Employee("John", 7, 12);
    }

    @Test
    public void getFinalSalary() {
        emp.computeFinalSalary();
        Assert.assertEquals(emp.getFinalSalary(), 250);
        System.out.println("test getFinalSalary success");
    }
}