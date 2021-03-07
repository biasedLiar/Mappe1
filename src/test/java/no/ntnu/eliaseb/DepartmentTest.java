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
    class PersonIsRemoved{

        @Test
        public void surgeonIsRemoved(){
            boolean exceptionTriggered = false;
            Surgeon surgeon = new Surgeon("Ole", "Nordmann", "123456789");
            department.addEmployee(surgeon);
            try {
                department.remove(surgeon);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertFalse(exceptionTriggered);
        }

        @Test
        public void generalPractitionerIsRemoved(){
            boolean exceptionTriggered = false;
            GeneralPractitioner generalPractitioner = new GeneralPractitioner("Ole", "Nordmann", "123456789");
            department.addEmployee(generalPractitioner);
            try {
                department.remove(generalPractitioner);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertFalse(exceptionTriggered);
        }

        @Test
        public void nurseIsRemoved(){
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);
            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertFalse(exceptionTriggered);
        }

        @Test
        public void patientIsRemoved(){
            boolean exceptionTriggered = false;
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);
            try {
                department.remove(patient);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertFalse(exceptionTriggered);
        }

        @Test
        public void identicalPersonRemoved(){
            boolean exceptionTriggered = false;
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);
            try {
                department.remove(new Patient("Ole", "Nordmann", "123456789"));
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertFalse(exceptionTriggered);
        }
    }
    @Nested
    class PersonIsNotRemoved{
        //Jeg prøvd å bruke expetcted exception men det fungerte ikke.

        @Test
        public void noPersonsInDepartment(){
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertTrue(exceptionTriggered);
        }

        @Test
        public void wrongPersonInDepartment(){
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);
            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertTrue(exceptionTriggered);
        }

        @Test
        public void personAlreadyRemoved(){
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);
            try {
                department.remove(nurse);
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertTrue(exceptionTriggered);
        }

        @Test
        public void personRemovedEqualsNull(){
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);
            try {
                department.remove(null);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }
            assertTrue(exceptionTriggered);
        }
    }

}
