package no.ntnu.eliaseb;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class represents a hospital.
 * It has a name, and an arraylist of departments.
 */
public class Hospital {
    private final String hospitalName;
    private ArrayList<Department> departments;

    /**
     * Creates a hospital object
     * @param hospitalName The name of the hospital
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        departments = new ArrayList<Department>();
    }

    /**
     * gets the name of the hospital
     * @return the name of the hospital
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * gets the list of departments
     * @return an array list of all the appartments
     */
    public ArrayList<Department> getDepartments() {
        return departments;
    }

    /**
     * Adds an department to the arraylist
     * @param department the department that is added
     */
    public void addDepartment(Department department) {
        departments.add(department);
    }

    /**
     * Checks if an object is equal to the hospital
     * @param o the object we are checking
     * @return true if they are identical, false if they are different
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(hospitalName, hospital.hospitalName) &&
                Objects.equals(departments, hospital.departments);
    }

    /**
     * generates hashcode for the hospital
     * @return the hashcode for the hospital
     */
    @Override
    public int hashCode() {
        return Objects.hash(hospitalName, departments);
    }

    /**
     * returns a string consisting of all the fields in the hospital
     * @return the string of all fields.
     */
    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
