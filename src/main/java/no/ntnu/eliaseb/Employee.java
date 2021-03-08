package no.ntnu.eliaseb;

public class Employee extends Person{
    /**
     * Creates a  employee object.
     * @param firstName The first name of the employee
     * @param lastName the last name of the employee
     * @param socialSecurityNumber the social security number of the employee
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Generates the toString for the employee.
     * @return The toString.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    /**
     * Checks if the Employee is equal to another Object.
     * @param o the object we are checking against.
     * @return True if they are the same Employee, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * Generates a hashcode for the two objects
     * @return the generated hashcode.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
