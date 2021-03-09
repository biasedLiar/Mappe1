package no.ntnu.eliaseb;

import java.util.Objects;

/**
 * This class represents a patient object.
 * It is a subclass of patient and implements the interface Diagnosable.
 * it has inherits the fields from Person, and also has a field for diagnosis.
 */
public class Patient extends Person implements Diagnosable{
    private String diagnosis;

    /**
     * Creates a patient object.
     * @param firstName the first name of the patient
     * @param lastName the last name of the patient
     * @param socialSecurityNumber the social security number of the patient
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = null;
    }

    /**
     * Gets the patient's diagnosis.
     * @return
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the patient's diagnosis.
     * @param diagnosis The diagnosis being set.
     */
    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * checks if the patient is equal to another object.
     * @param o the object we are checking against.
     * @return true if they are equal, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(diagnosis, patient.diagnosis);
    }

    /**
     * creates a hashcode for the patient.
     * @return the hashcode for the patient.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diagnosis);
    }

    /**
     * creates a string that shows all the values for all the patient's fields.
     * @return the string of all the patient's fields.
     */
    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
