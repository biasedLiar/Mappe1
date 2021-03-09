package no.ntnu.eliaseb;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class represents a department.
 * It's fields are the department name, an arraylist of employees and an arraylist of patients.
 */
public class Department {
    private String departmentName;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;

    /**
     * Creates an department object
     * @param departmentName the name of the department
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<Employee>();
        patients = new ArrayList<Patient>();
    }

    /**
     * returns the name of the department
     * @return the name of the department
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the name of the department
     * @param departmentName the new name of the department
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * gets the arraylist of employees
     * @return the arraylist of employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * adds an employee to the list.
     * @param employee the employee being added to the list
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * gets the list of patients
     * @return the arraylist of patients
     */
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * Adds a new patient to the list
     * @param patient the patient being added
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    /**
     * Removes a employee or patient from the hospital.
     * @param person the person being removed.
     * @throws RemoveException Throws exception if the removed person is neither registered as an employee or patient.
     */
    public void remove(Person person) throws RemoveException {
        //the remove() method returns true if person is removed and false if it is not.
        if(!employees.remove(person)){
            if(!patients.remove(person)){
                throw new RemoveException("Person is neither employee or patient.");
            }
        }
    }

    /**
     * empties the list of employees and patients.
     */
    public void emptyDepartment(){
        employees.clear();
        patients.clear();
    }

    /**
     * checks if the department is equal to the object being passed
     * @param o the object we are checking if is equal to this department
     * @return true if they are identical, false if they are different
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(employees, that.employees) &&
                Objects.equals(patients, that.patients);
    }

    /**
     * generates the hashcode for the department.
     * @return the hashcode for the department
     */
    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employees, patients);
    }

    /**
     * creates a string that shows the value of all fields in the department
     * @return the string showing all values in all fields.
     */
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
