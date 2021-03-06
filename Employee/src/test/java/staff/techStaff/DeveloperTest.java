package staff.techStaff;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.*;

public class DeveloperTest {

    Employee developer;

    @Before
    public void before() {
        developer = new Developer("Rose", "DF 45 67 89 E", 3000);
    }

    @Test
    public void getName() {
        assertEquals("Rose", developer.getName());
    }

    @Test
    public void getNationalInsuranceNumber() {
        assertEquals("DF 45 67 89 E", developer.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(3000, developer.getSalary(), 0.001);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(200);
        assertEquals(3200, developer.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        developer.raiseSalary(-200);
        assertEquals(3000, developer.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(30, developer.payBonus(), 0.001);
    }

    @Test
    public void setName() {
        developer.setName("Sandra");
        assertEquals("Sandra", developer.getName());
    }

    @Test
    public void cannotSetNameToNull() {
        developer.setName(null);
        assertEquals("Rose", developer.getName());
    }
}