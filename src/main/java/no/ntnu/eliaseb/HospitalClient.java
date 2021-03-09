package no.ntnu.eliaseb;

import java.util.ArrayList;

/**
 * This class is the client that runs our program.
 */
public class HospitalClient {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Haukeland Sykehus");
        HospitalTestData.fillRegisterWithTestData(hospital);
        Employee employee = new Employee("Odd Even", "Primtallet", "");
        Patient patient = new Patient("Berte", "Solheim", "321321321");
        ArrayList<Department> departments= hospital.getDepartments();
        try {
            departments.get(0).remove(employee);
            System.out.println("Employee successfully removed");
        } catch (RemoveException e){
            System.out.println(e);
        }
        try{
            departments.get(0).remove(patient);
            System.out.println("Something went wrong. Non existing employee removed.");
        } catch (RemoveException e){
            System.out.println("Remove exception as expected.");
        }

    }
}
