package no.ntnu.eliaseb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DepartmentTest {
    private Department department = new Department("Haukeland Sykehus");

    @BeforeEach
    public void setUp() {
        department.emptyDepartment();


    }

    @Nested
    class APersonIsRemoved{

        @Test
        public void surgeonIsRemoved(){
            boolean exception = false;
            Surgeon surgeon = new Surgeon("Ole", "Nordmann", "123456789");
            department.addEmployee(surgeon);
            try {
                department.remove(surgeon);
            } catch (RemoveException e){
                exception = true;
            }
            assertFalse(exception);
        }






    }

}
