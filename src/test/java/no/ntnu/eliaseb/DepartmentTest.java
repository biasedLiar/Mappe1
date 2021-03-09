package no.ntnu.eliaseb;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {




    @Nested
    class PersonIsRemoved{

        @Test
        public void surgeonIsRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Surgeon surgeon = new Surgeon("Ole", "Nordmann", "123456789");
            department.addEmployee(surgeon);

            try {
                department.remove(surgeon);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertFalse(exceptionTriggered); //Sjekker at remove exception ikke skjedde
            assertEquals(department.getEmployees(), new ArrayList<Employee>()); //Sjekker at employees listen er tom
        }

        @Test
        public void generalPractitionerIsRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            GeneralPractitioner generalPractitioner = new GeneralPractitioner("Ole", "Nordmann", "123456789");
            department.addEmployee(generalPractitioner);

            try {
                department.remove(generalPractitioner);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertFalse(exceptionTriggered);//Sjekker at remove exception ikke skjedde
            assertEquals(department.getEmployees(), new ArrayList<Employee>()); //Sjekker at employees listen er tom

        }

        @Test
        public void nurseIsRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);

            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertFalse(exceptionTriggered);//Sjekker at remove exception ikke skjedde
            assertEquals(department.getEmployees(), new ArrayList<Employee>()); //Sjekker at employees listen er tom

        }

        @Test
        public void patientIsRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);

            try {
                department.remove(patient);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertFalse(exceptionTriggered);//Sjekker at remove exception ikke skjedde
            assertEquals(department.getPatients(), new ArrayList<Patient>()); //Sjekker at Patient listen er tom

        }

        @Test
        public void identicalPersonRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);

            try {
                department.remove(new Patient("Ole", "Nordmann", "123456789"));
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertFalse(exceptionTriggered);//Sjekker at remove exception ikke skjedde
            assertEquals(department.getPatients(), new ArrayList<Patient>()); //Sjekker at Patient listen er tom

        }
    }
    @Nested
    class PersonIsNotRemoved{
        //Jeg prøvd å bruke expetcted exception men det fungerte ikke.

        @Test
        public void noPersonsInDepartment(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");

            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertTrue(exceptionTriggered);//Sjekker at remove exception skjedde
        }
        @Test
        public void wrongPersonInDepartment(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Patient patient = new Patient("Lise", "Lund", "987654321");
            Patient patient2 = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);

            try {
                department.remove(patient2);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertTrue(exceptionTriggered); //Sjekker at remove exception skjedde
        }
        @Test
        public void wrongPersonTypeInDepartment(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            Patient patient = new Patient("Ole", "Nordmann", "123456789");
            department.addPatient(patient);

            try {
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertTrue(exceptionTriggered); //Sjekker at remove exception skjedde
        }

        @Test
        public void personAlreadyRemoved(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);

            try {
                department.remove(nurse);
                department.remove(nurse);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertTrue(exceptionTriggered); //Sjekker at remove exception skjedde
        }

        @Test
        public void personRemovedEqualsNull(){
            Department department = new Department("Haukeland Sykehus");
            boolean exceptionTriggered = false;
            Nurse nurse = new Nurse("Ole", "Nordmann", "123456789");
            department.addEmployee(nurse);

            try {
                department.remove(null);
            } catch (RemoveException e){
                exceptionTriggered = true;
            }

            assertTrue(exceptionTriggered); //Sjekker at remove exception skjedde
        }
    }

}
