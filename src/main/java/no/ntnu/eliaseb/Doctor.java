package no.ntnu.eliaseb;

/**
 * This abstract class represents a doctor and is a subclass of Employee.
 * It inherits the fields first name, last name and social security number form Employee.
 */
public abstract class Doctor extends Employee{

    /**
     * Creates a new Doctor object.
     * @param firstName the first name of the doctor.
     * @param lastName the last name of the doctor.
     * @param socialSecurityNumber the social security number of the doctor.
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a diagnosis for a patient.
     * @param patient the patient we are setting the diagnosis for
     * @param diagnosis the diagnosis the patient is getting.
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);

    /**
     * This method generates a string consisting of the values of all the doctor's fields.
     * @return the string consisting of all the doctor's fields.
     */
    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    /**
     * checks if the doctor is equal to another object.
     * @param o the object we are checking against.
     * @return true if they are equal, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * generates a hashcode for the doctor.
     * @return the hashcode for the doctor.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
