package no.ntnu.eliaseb;

/**
 * This class represents a nurse and is a subclass of Employee.
 * It inherits the fields first name, last name, and social security number from Employee.
 */
public class Nurse extends Employee{
    /**
     * Creates a nurse object.
     * @param firstName the first name of the nurse.
     * @param lastName the last name of the nurse.
     * @param socialSecurityNumber the social security number of the nurse.
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }



    /**
     * this method creates a string consisting of the values of all the fields of the nurse object.
     * @return the string created.
     */
    @Override
    public String toString() {
        return "Nurse{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }


}
