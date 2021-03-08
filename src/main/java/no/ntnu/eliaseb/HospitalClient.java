package no.ntnu.eliaseb;

import java.util.ArrayList;

public class HospitalClient {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Haukeland Sykehus");
        HospitalTestData.fillRegisterWithTestData(hospital);
        Employee employee = new Employee("Odd Even", "Primtallet", "");
        ArrayList<Department> departments= hospital.getDepartments();
        try {
            departments.get(0).remove(employee);
        } catch (RemoveException e){

        }
    }
}
