package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.*;

public class ManagerTest {

    Employee manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "AB 12 34 56 C", 5000, "Development");
    }

    @Test
    public void getName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void getNationalInsuranceNumber() {
        assertEquals("AB 12 34 56 C", manager.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(5000, manager.getSalary(), 0.001);
    }

    @Test
    public void getDeptName() {
        assertEquals("Development", ((Manager) manager).getDeptName());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(500);
        assertEquals(5500, manager.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(50, manager.payBonus(), 0.001);
    }

}