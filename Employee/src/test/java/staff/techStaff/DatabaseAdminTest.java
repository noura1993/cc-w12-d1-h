package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Mike", "JK 45 98 89 M", 4000);
    }

    @Test
    public void getName() {
        assertEquals("Mike", databaseAdmin.getName());
    }

    @Test
    public void getNationalInsuranceNumber() {
        assertEquals("JK 45 98 89 M", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(4000, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(4500, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void payBonus() {
        assertEquals(40, databaseAdmin.payBonus(), 0.001);
    }
}