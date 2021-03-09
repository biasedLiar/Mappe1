package no.ntnu.eliaseb;

import java.util.Objects;

/**
 * This class represents a Surgeon, which is a subclass of Doctor.
 * It inherits the fields first name, last name and social security number from Doctor.
 */
public class Surgeon extends Doctor{
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * This method sets the diagnosis for a patient.
     * @param patient the patient we are setting the diagnosis for
     * @param diagnosis the diagnosis the patient is getting.
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        if (!Objects.isNull(patient)) {
            patient.setDiagnosis(diagnosis);
        }
    }

    /**
     * Creates a string consisting of the values of all of the fields.
     * @return the string consisting of the values of all of the fields.
     */
    @Override
    public String toString() {
        return "Surgeon{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    /**
     * this method checks if the surgeon is equal to another object.
     * @param o the object we are checking if is equal to the surgeon.
     * @return true if they are equal, false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    /**
     * This object creates a hashcode for the surgeon.
     * @return the hashcode for the surgeon.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
