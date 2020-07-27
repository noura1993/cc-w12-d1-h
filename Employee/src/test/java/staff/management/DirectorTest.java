package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.*;

public class DirectorTest {

    Employee director;

    @Before
    public void before() {
        director = new Director("Tom", "KL 45 96 28 G", 4500, "Development", 10000);
    }

    @Test
    public void getName() {
        assertEquals("Tom", director.getName());
    }

    @Test
    public void getNationalInsuranceNumber() {
        assertEquals("KL 45 96 28 G", director.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(4500, director.getSalary(), 0.001);
    }

    @Test
    public void getDeptName() {
        assertEquals("Development", ((Director) director).getDeptName());
    }

    @Test
    public void getBudget() {
        assertEquals(10000, ((Director) director).getBudget(), 0.001);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(500);
        assertEquals(5000, director.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(45, director.payBonus(), 0.001);
    }

}